package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.karyawan.AkunKaryawan;
//import model.Staff;
public class AkunKaryawanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
      public void insertAkunKaryawan(AkunKaryawan ak)
    {
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO AkunKaryawan(Username, Password,nomorHP ,emailKaryawan) VALUES"
                + " ('" + ak.getUsername() +"','"+ak.getPassword()+"','"+ak.getNoHp()+"','"
                + ak.getEmailKaryawan()+"')";
        System.out.println("Adding Akun....");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " +result+" Akun Karyawan" );
        }catch(Exception e)
        {
            System.out.println("Error Adding Akun..");
            System.out.println(e);
        }
    }
    
    //Search
    public AkunKaryawan searchAkunStaff(String username , String password)
    {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM AkunKaryawan where username = '"+ username +"' and password = '"+ password +"'";
        
        System.out.println("Searching Akun Staff");
        
        AkunKaryawan as = null;

        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null)
            {
                while(rs.next())
                {              
                   as = new AkunKaryawan(
                            rs.getString("Username"),
                            rs.getString("Password"));     
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error searching data Staff");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return as;
    }
    
    public void deleteAkunKaryawan(String username)
    {
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM AkunKaryawan WHERE username = '"+username+"'";
        System.out.println("Deleting AkunKaryawan");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" akun Karyawan "+username );
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Akun Karyawan");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    //Operasi CRUDS 
    //Create -> Buat akun
    //Read --> Baca akun -> Select 
    //Update --> Ubah akun --> Tidak terlalu butuh
    //Delete --> Tidak terlalu butuh --> 
    //Search --> Cari akun
    
    
}
