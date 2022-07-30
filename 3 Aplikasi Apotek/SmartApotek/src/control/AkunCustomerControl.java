package control; //Posisi source code berada di package control

import model.AkunCustomer; 
import dao.AkunCustomerDAO;

public class AkunCustomerControl {
    private AkunCustomerDAO acDAO = new AkunCustomerDAO();
    
    
    //Write
    public void insertAkunCustomer(AkunCustomer c)
    {
        acDAO.insertAkunCustomer(c);
    }
    
    
    //Read
    public AkunCustomer searchAkunCustomer(String username, String password)
    {
        AkunCustomer akuncustomer= null;
        akuncustomer = acDAO.searchAkunCustomer(username, password);
        return akuncustomer;            
    }
}
