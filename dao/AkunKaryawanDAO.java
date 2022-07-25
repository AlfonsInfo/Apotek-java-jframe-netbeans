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
    
    //Operasi CRUDS 
    //Create -> Buat akun
    //Read --> Baca akun -> Select 
    //Update --> Ubah akun --> Tidak terlalu butuh
    //Delete --> Tidak terlalu butuh --> 
    //Search --> Cari akun
    
    
}
