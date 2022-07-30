package dao;

import connection.DbConnection; // setiap transaksi ke database perlu membuka & menutup koneksi
import java.sql.Connection;  // Interface sesi koneksi ke database
import java.sql.ResultSet; // Interface untuk transaksi ke database (Represent  a set of data returned from a data source)
import java.sql.Statement; // Interface untuk transaksi ke database ( Untuk eksekusi Query)

import java.util.ArrayList;
import java.util.List;
import model.Obat;

public class ObatDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    //Create(Membuat) atau Insert data ke database
    public void insertObat(Obat B)
    {
        con = dbcon.makeConnection();
        System.out.println("Test Point");
        
        String sql  = "INSERT INTO Obat(kodeObat, namaObat, Sediaan,khasiat,hargaJual, modal, stok) VALUES"
                + "('" + B.getKodeObat() + "', '" + B.getNamaObat() +"','" + B.getSediaan() +"','"+ B.getKhasiat()+"',"
                + B.getHargaJual()+","+ B.getModal() +","+B.getStok()+")";
        System.out.println("Adding Obat");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+ result +" Produk");
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error Adding Obat");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    //Read (Membaca data dari database untuk ditampilkan)
    public List<Obat> showObat(String query)
    {
        con = dbcon.makeConnection();
        
        String sql  = "SELECT * FROM Obat WHERE("
                + "kodeObat LIKE '%"+ query+"%'"
                + "OR namaObat LIKE '%" + query+"%'"
                + "OR sediaan LIKE '%"+query+"%'"
                + "OR khasiat LIKE '%"+query+"%')";
        
        System.out.println("Mengambil Data Obat");
        
        List<Obat> list  = new ArrayList();
        
        try{
            Statement statement = con.createStatement();    
            ResultSet rs =  statement.executeQuery(sql);
            
            if(rs != null)
            {
               while(rs.next())
               {   //rs.getFloat() == Float.parseFloat(rs.getString())
                   Obat b = new Obat(rs.getString("kodeObat"),rs.getString("namaObat")
                           ,rs.getString("sediaan"), rs.getString("khasiat"),rs.getFloat("hargaJual"), 
                            rs.getFloat("Modal"),rs.getInt("stok"));
                   list.add(b);
               }
            }
            rs.close();
            statement.close();
        } catch(Exception e)
        {
            System.out.println("Error reading data Obat");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    //Update
    public void updateObat(Obat o, String kode)
    {
        con = dbcon.makeConnection();
        String sql = "Update Obat set namaObat ='"+ o.getNamaObat()+"',"
        + "sediaan = '"+ o.getSediaan() + "',khasiat = '"+o.getKhasiat() +"', modal = "+o.getModal()+", hargaJual = "+o.getHargaJual()
        + ", stok = "+o.getStok() + " WHERE kodeObat ='" + kode + " '";
        
        System.out.println("Updating Obat...");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Obat"+ kode);
        }catch(Exception e)
        {
            System.out.println("ERROR UPDATING DATA OBAT");
            System.out.println(e);
        }
    }
    
    //Delete
    public void deleteObat(String kode)
    {
        con = dbcon.makeConnection();
        String sql = "DELETE FROM Obat WHERE kodeObat = '"+kode+"'";
        System.out.println("Deleting Obat...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ "Obat" +kode);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error Deleting Obat...");
            System.out.println(e);
        }
    }
    
}
