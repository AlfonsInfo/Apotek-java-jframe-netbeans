package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection CON;
    //"jdbc:ucanaccess://e://Java//JavaSE//MsAccess//Contacts.accdb";
    String databaseURL ="jdbc:ucanaccess///dataApotek.accdb";
    //
    
    public Connection makeConnection()
    {
        System.out.println("Opening Database...");
        try{
            CON = DriverManager.getConnection(databaseURL);
        }catch(Exception e)
        {
            System.out.println("Error Opening Database...");
            System.out.println(e);
        }
        return  CON;
    }
    
    public void closeConnection()
    {
        System.out.println("Closing Database...");
        try{
            CON.close();
            System.out.println("Success");
        }catch(Exception e)
        {
            System.out.println("Error Closing Database...");
            System.out.println(e);
        }
    }
    
}
