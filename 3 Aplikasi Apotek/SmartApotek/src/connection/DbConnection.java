package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;

//import java.lang.Class;

public class DbConnection {
    public static Connection CON;    
    public String URL  = "jdbc:ucanaccess://";
    String currentDir = System.getProperty("user.dir");  // agar menyesuaikan dengan tempat file disimpan   
    public String PATH = currentDir+"/src/dataApotek.accdb";  // D:/dataApotek
    //D:\1-Document\0-Visual Home\7-Dev\1-Code\2 Java\100 Dev Apotek\3 Aplikasi Apotek\JavaApplication12 + src/dataApotek.accdb
    
    public Connection makeConnection()
    {
        System.out.println("Opening Database...");
        try{
            CON = DriverManager.getConnection(URL+PATH);
            System.out.println("Success (Opening Database)!");
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
            System.out.println("Success (Closing Database)!!");
        }catch(Exception e)
        {
            System.out.println("Error Closing Database...");
            System.out.println(e);
        }
    }
    
}
