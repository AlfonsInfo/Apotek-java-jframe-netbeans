package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Departemen;

//import model yang diikutsertakan
import model.karyawan.*;

public class ManajerDAO extends KaryawanDAO{
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    private KaryawanDAO kDAO;
    
    
    //create  == insert == membuat / menambahkan data ke database
    public void insertManajer(Manajer k)
    {
        con = dbcon.makeConnection();
        String sql = "INSERT INTO Manajer (tunjangan, idKaryawan)"
                + "VALUES("+k.getTunjangan()+ ","
                + k.getIdKaryawan();
        System.out.println("Adding Manajer");        
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Manajer");
            kDAO.insertKaryawan(k);
        }catch(Exception e)
        {
            System.out.println("Error Adding Manajer");
            System.out.println(e);
        }
        dbcon.closeConnection();     
    }
    
    //read == show == Mengambil data dari database
    public List<Manajer> showManajer(String query)
    {
        con = dbcon.makeConnection();
        
           /* String sql = "SELECT k.* , ak.*, d.*,m.* FROM Karyawan as k JOIN akunKaryawan as ak ON k.Username = ak.Username "
                    + "JOIN Departemen as d ON k.idDepartemen = d.idDepartemen JOIN manajer as m ON k.idKaryawan = m.idKaryawan "
                + "WHERE (k.idKaryawan LIKE '%" + query +"%'"
                + "OR k.namaKaryawan LIKE '%" + query +"%'"
                + "OR k.gaji LIKE '%" + query +"%'"
                + "OR m.tunjangan LIKE '%" +query+"%'"
                + "OR ak.username LIKE '%" +query +"%'"
                + "OR d.namaDepartemen LIKE '%"+query+"%')";*/
           
           /*
           String sql = "SELECT * FROM Departemen INNER JOIN (AkunKaryawan INNER JOIN Karyawan ON AkunKaryawan.Username = Karyawan.username) ON Departemen.idDepartemen = Karyawan.idDepartemen INNER JOIN Manajer ON Karyawan.idKaryawan = Manajer.idKaryawan"
                + " WHERE (Karyawan.idKaryawan LIKE '%" + query +"%'"
                + "OR Karyawan.namaKaryawan LIKE '%" + query +"%'"
                + "OR Karyawan.gaji LIKE '%" + query +"%'"
                + "OR Manajer.tunjangan LIKE '%" +query+"%'"
                + "OR Akunkaryawan.Username LIKE '%" +query +"%'"
                + "OR Departemen.namaDepartemen LIKE '%"+query+"%')";*/
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
                  Manajer m = new Manajer(Float.parseFloat(rs.getString("tunjangan")),rs.getString("idKaryawan"),rs.getString("namaKaryawan"),Float.parseFloat(rs.getString("gaji")),ak,d);
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
                 kDAO.updateKaryawan(k);
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
        
        String sql = "Delete From Manajer WHERE id_karyawan = '"+id+"'";
        System.out.println("Deleting Manajer");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Manajer "+ id);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
}
