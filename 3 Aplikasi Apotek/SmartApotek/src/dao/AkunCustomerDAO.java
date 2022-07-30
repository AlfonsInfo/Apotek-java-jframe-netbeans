package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.AkunCustomer;

public class AkunCustomerDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
      //create 
    public void insertAkunCustomer(AkunCustomer ak)
    {
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO AkunCustomer(Username, Password,email ,alamat) VALUES"
                + " ('" + ak.getUsername() +"','"+ak.getPassword()+"','"+ak.getEmail()+"','"
                + ak.getAlamat()+"')";
        System.out.println("Adding Akun....");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " +result+" Akun" );
        }catch(Exception e)
        {
            System.out.println("Error Adding Akun..");
            System.out.println(e);
        }
    }
    
      //Search
    public AkunCustomer searchAkunCustomer(String username , String password)
    {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM AkunCustomer where username = '"+ username +"' and password = '"+ password +"'";
        
        System.out.println("Searching Akun Staff");
        
        AkunCustomer as = null;

        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs != null)
            {
                while(rs.next())
                {              
                   as = new AkunCustomer(
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
    
}
