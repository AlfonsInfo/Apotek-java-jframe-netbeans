package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Departemen;
import model.karyawan.*;


public class StafDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    private KaryawanDAO kDAO = new KaryawanDAO();
              
    
    public void insertStaf(Staf k)
    {
        
        
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO Staf (namaBidang, idKaryawan)"
                + "VALUES('"+k.getNamaBidang()+ "','"
                + k.getIdKaryawan()+"')";
        
        System.out.println("Adding Staf");          
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            
            System.out.println("Added "+result+" Staf");
        }catch(Exception e)
        {
            System.out.println("Error Adding Staff");
            System.out.println(e);
        }
        dbcon.closeConnection();   
     //   Karyawan K = new Karyawan(k.getIdKaryawan(),k.getNamaKaryawan(), k.getGaji(), k.getAkunKaryawan(), k.getDepartemen());
       // insertKaryawan(k);
        kDAO.insertKaryawan(k);
    }
    
    
        //read == show == Mengambil data dari database
    public List<Staf> showStaf(String query)
    {
          con = dbcon.makeConnection(); 
        
String sql = "SELECT Karyawan.idKaryawan, Karyawan.namaKaryawan, Karyawan.gaji, Staf.namaBidang, AkunKaryawan.Username, Departemen.namaDepartemen, AkunKaryawan.Password, Departemen.idDepartemen\n" +
"FROM Departemen INNER JOIN ((AkunKaryawan INNER JOIN Karyawan ON AkunKaryawan.Username = Karyawan.Username) INNER JOIN Staf ON Karyawan.idKaryawan = Staf.idKaryawan) ON Departemen.idDepartemen = Karyawan.idDepartemen;";
        
        System.out.println("Mengambil data Staf");
        
        List<Staf> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null)
            {
                
                while(rs.next())
                {   
                   AkunKaryawan ak = new AkunKaryawan(rs.getString("Username"),rs.getString("Password") );
                   Departemen d = new Departemen(Integer.parseInt(rs.getString("idDepartemen")),rs.getString("namaDepartemen"));
                   Staf s = new Staf(rs.getString("namaBidang"),rs.getString("idKaryawan"),rs.getString("namaKaryawan"),Double.parseDouble(rs.getString("gaji")),ak,d);
                   list.add(s);
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
    
    
        public void deleteStaf(String id){
        con = dbcon.makeConnection();
        
        String sql = "Delete From Staf WHERE idKaryawan = '"+id+"'";
        System.out.println("Deleting Staf");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Staf "+ id);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
}
