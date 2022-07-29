package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import model yang diikutsertakan
import model.karyawan.*;
import model.Departemen;
public class KaryawanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    
    //create  == insert == membuat / menambahkan data ke database
    public void insertKaryawan(Karyawan k)
    {
        con = dbcon.makeConnection();
        String sql = "INSERT INTO Karyawan (idKaryawan, namaKaryawan, gaji, idDepartemen,username ) "
                + "VALUES ('"+ k.getIdKaryawan() + "', '"
                + k.getNamaKaryawan() + "', "
                + k.getGaji() + ",' "
                + k.getDepartemen().getIdDepartemen()+"','"
                + k.getAkunKaryawan().getUsername() + " ')";
        System.out.println("Adding Karyawan");        
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Karyawan");
        }catch(Exception e)
        {
            System.out.println("Error Adding Karyawan");
            System.out.println(e);
        }
        dbcon.closeConnection();     
    }
    
    //read == show == Mengambil data dari database
    public List<Karyawan> showKaryawan(String query)
    {
        con = dbcon.makeConnection();
        
        String sql = "SELECT k.* , ak.*, d.* FROM Karyawan as k JOIN akunKaryawan as ak ON k.Username = ak.Username "
                + "JOIN Departemen as d ON k.idDepartemen = d.idDepartemen "; //Wherenya perlu tidak?
        System.out.println("Mengambil data Karyawan");
        
        List<Karyawan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null)
            {
                while(rs.next())
                {
                    AkunKaryawan ak = new AkunKaryawan(rs.getString("ak.Username"), rs.getString("ak.Password"));
                    Departemen d = new Departemen(Integer.parseInt(rs.getString("d.idDepartemen")),rs.getString("d.namaDepartemen"));
                    Karyawan k = new Karyawan(rs.getString("k.idKaryawan"),rs.getString("k.namaKaryawan"),Double.parseDouble("k.gaji"),ak,d);
                    list.add(k);
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
    
    //Update namaKaryawan, gaji, Username, idDepartemen
    public void updateKaryawan(Karyawan k)
    {
        con = dbcon.makeConnection();
        
        String sql = "UPDATE Karyawan SET namaKaryawan = '"+k.getNamaKaryawan()
                +"', "+k.getGaji()+" ,' " + k.getAkunKaryawan().getUsername()+"','"
                + k.getDepartemen().getIdDepartemen()+"' WHERE idKaryawan = '"
                +  k.getIdKaryawan() + "'";
        
        System.out.println("Editing Karyawan");
    
        try{
            Statement statement = con.createStatement();
                int result = statement.executeUpdate(sql);
                System.out.println("Edited " + result + " Karyawan " + k.getIdKaryawan());
                statement.close();       
        }catch(Exception e)
        {
            System.out.println("Error Editing Data Karyawan");
            System.out.println(e);
        }
        
        dbcon.closeConnection();
    }
    
    //Delete
    public void deleteKaryawan(String id)
    {
        con = dbcon.makeConnection();
        
        String sql = "Delete From Karyawan WHERE id_karyawan = '"+id+"'";
        System.out.println("Deleting Karyawan");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Karyawan "+ id);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
}
