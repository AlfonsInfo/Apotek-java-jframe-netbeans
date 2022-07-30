package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import model.Departemen;

//import model yang diikutsertakan
import model.karyawan.*;

public class ManajerDAO extends KaryawanDAO{
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    private KaryawanDAO kDAO = new KaryawanDAO();
    
    
    //create  == insert == membuat / menambahkan data ke database
    public void insertManajer(Manajer k)
    {
        
        
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO Manajer (tunjangan, idKaryawan)"
                + "VALUES("+k.getTunjangan()+ ",'"
                + k.getIdKaryawan()+"')";
        
        System.out.println("Adding Manajer");          
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            
            System.out.println("Added "+result+" Manajer");
        }catch(Exception e)
        {
            System.out.println("Error Adding Manajer");
            System.out.println(e);
        }
        dbcon.closeConnection();   
     //   Karyawan K = new Karyawan(k.getIdKaryawan(),k.getNamaKaryawan(), k.getGaji(), k.getAkunKaryawan(), k.getDepartemen());
       // insertKaryawan(k);
        kDAO.insertKaryawan(k);
    }
    
    
    //read == show == Mengambil data dari database
    public List<Manajer> showManajer(String query)
    {
        con = dbcon.makeConnection();
        
         /*   String sql = "SELECT k.* , ak.*, d.*,m.* FROM Karyawan as k JOIN akunKaryawan as ak ON k.Username = ak.Username "
                    + "JOIN Departemen as d ON k.idDepartemen = d.idDepartemen JOIN manajer as m ON k.idKaryawan = m.idKaryawan "
                + "WHERE (k.idKaryawan LIKE '%" + query +"%'"
                + "OR k.namaKaryawan LIKE '%" + query +"%'"
                + "OR k.gaji LIKE '%" + query +"%'"
                + "OR m.tunjangan LIKE '%" +query+"%'"
                + "OR ak.username LIKE '%" +query +"%'"
                + "OR d.namaDepartemen LIKE '%"+query+"%')";*/
           
           

 String sql = "SELECT Karyawan.idKaryawan, Karyawan.namaKaryawan, Karyawan.gaji, Manajer.tunjangan, AkunKaryawan.Username, Departemen.namaDepartemen, AkunKaryawan.Password, Departemen.idDepartemen\n" +
"FROM Departemen INNER JOIN ((AkunKaryawan INNER JOIN Karyawan ON AkunKaryawan.Username = Karyawan.Username) INNER JOIN Manajer ON Karyawan.idKaryawan = Manajer.idKaryawan) ON Departemen.idDepartemen = Karyawan.idDepartemen;";
 
 
           
        System.out.println("Mengambil data Karyawan");
        
        List<Manajer> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null)
            {
                
                while(rs.next())
                {   
                  AkunKaryawan ak = new AkunKaryawan(rs.getString("Username"),rs.getString("Password") );
              //   AkunKaryawan ak = new AkunKaryawan(rs.getString("AkunKaryawan.Username"), rs.getString("AkunKaryawan.Password"));
                   Departemen d = new Departemen(Integer.parseInt(rs.getString("idDepartemen")),rs.getString("namaDepartemen"));
                   Manajer m = new Manajer(Double.parseDouble(rs.getString("tunjangan")),rs.getString("idKaryawan"),rs.getString("namaKaryawan"),Double.parseDouble(rs.getString("gaji")),ak,d);
                    list.add(m);
                    
                };
                
            
            }
            rs.close();
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error Reading Database");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    //Update
    public void updateManajer(Manajer k)
    {
        con = dbcon.makeConnection();
        
        String sql = "Update Manajer SET namaDepartemen = '"+k.getNamaKaryawan()+"' WHERE"
                + "idKaryawan = '"+k.getIdKaryawan()+"'";
        
        System.out.println("Editing Karyawan");
    
        try{
                Statement statement = con.createStatement();
                int result = statement.executeUpdate(sql);
                System.out.println("Edited " + result + " Manajer" + k.getIdKaryawan());
            //     kDAO.updateKaryawan(k);
                statement.close();
        }catch(Exception e)
        {
            System.out.println("Error");
            System.out.println(e);
        }
       
        dbcon.closeConnection();
    }
    
    //Delete
    public void deleteManajer(String id){
        con = dbcon.makeConnection();
        
        String sql = "Delete From Manajer WHERE idKaryawan = '"+id+"'";
        System.out.println("Deleting Manajer");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Manajer "+ id);
            kDAO.deleteKaryawan(id);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    
    
    /*
        private String formatRupiah(double value)
    {
        DecimalFormat formatter = (DecimalFormat)DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
        
        symbols.setCurrencySymbol("Rp. ");
        symbols.setMonetaryDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(symbols);
         
        return formatter.format(value);
    }*/
    
    
   
}





/*
 Catatan
Polimorfisme : Banyak bentuk ( Overriding method/constructor ) , menggunakan 
kelas konkrit/abstrak/interface
1 Method / Konstruktor dgn nama sama --> Banyak Functionalities 
namun jika digunakan secara tidak tepat, dapat menyebabkan coupling
Kekurangan lainnya : Jika B dan C inheritance dari kelas A, dan menerapkan
beberapa method yang di overriding. Kemudian objek B dibuat dgn konstruktor
dan disimpan di kelas A, Maka jika ada method konkrit di kelas B tidak bisa dipanggil
dari main atau kelas lainnya. Maka method tersebut harus digunakan dengan method
penghubung/interface yang merupakan method overriding dari kelas induk.


Misalnya :
KelasA

 ABSTRACT METHOD X
KelasB

 METHOD Y
 METHOD X{ METHOD Y} // overriding dari method X dari kelas A 
// Method Y bisa diakses jika method tersebut berada pada method yang dioverriding
//dari kelas induk
 
KelasC

 METHOD C

Main
 KelasA = new KelasB  // Implementasi dari overriding constructor
 
 B.MethodY // ini tidak bisa

Polimorfisme juga beresiko menmabah beban kerja komputer, (Komputer butuh waktu untuk mengneali method mana yang perlu dijalankan)
*/