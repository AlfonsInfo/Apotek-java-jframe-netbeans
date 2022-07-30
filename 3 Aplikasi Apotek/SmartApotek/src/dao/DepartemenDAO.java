package dao;

import connection.DbConnection;
import java.sql.Connection;
import  java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Departemen;

/**
 * @author Alfonsus Setiawan Jacub
 */
public class DepartemenDAO {
    
    private DbConnection dbcon = new DbConnection();
    private Connection con;

//CRUD  :Create ,Read, Update, Delete

//Create / Insert  
public void insertDepartemen(Departemen d)
{
    con = dbcon.makeConnection();
    String sql = "INSERT INTO Departemen (idDepartemen, [namaDepartemen]) VALUES ("+
            d.getIdDepartemen()+",'"+d.getNamaDepartemen()+"')";
    System.out.println("Adding Departemen");
    
    try{
        Statement statement = con.createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("Adding " + result + " Departemen");
        statement.close();
    }catch(Exception e)
    {
        System.out.println("Error Adding Departemen");
        System.out.println(e);
    }
    dbcon.closeConnection();    
}

//Read / Show
//Show kedalam tabel
public List<Departemen> showDepartemen()
{
    con = dbcon.makeConnection();
    
    String sql = "SELECT * From departemen";
    
    System.out.println("Mengambil data Departemen");
    
    List<Departemen> list = new ArrayList();
    
    try{
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        
        if(rs != null)
        {
            while(rs.next())
            {
                Departemen d = new Departemen(rs.getInt("idDepartemen"), rs.getString("namaDepartemen"));
                list.add(d);
            }
        }
        rs.close();
        statement.close();
    }catch(Exception e)
    {
        System.out.println("Error reading database");   
    }
    dbcon.closeConnection();
    return list;
}

//update
public void updateDepartemen(Departemen d){
        con = dbcon.makeConnection();
        
        String sql = "UPDATE departemen SET idDepartemen = '" + d.getIdDepartemen()+"', "
                +"namaDepartemen = '"+d.getNamaDepartemen()+"' "
                + "WHERE idDepartemen = "+ d.getIdDepartemen()+" ";
        System.out.println("Editing Departemen");
        
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+ result + "Departemen");
        }catch(Exception e)
        {
            System.out.println("Error editing departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
}

//Delete
public void deleteDepartemen(String id)
{
    con = dbcon.makeConnection();
    
    String sql = "Delete FROM departemen Where idDepartemen = '" +id +"'";
    System.out.println("Deleting Departemen");
    try
    {
        Statement statement = con.createStatement();
        int result = statement.executeUpdate(sql);
    }catch(Exception e)
    {
        System.out.println("Error deleting Departemen");
        System.out.println(e);
    }
    dbcon.closeConnection();
}
    

}
