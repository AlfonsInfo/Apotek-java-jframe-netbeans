package model;

/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class AkunStaff {
    //Field
    private String username;
    private String password;
 //   private Staff staff;
    
    //Constructor
    public AkunStaff(String username, String password)
    {
        this.username =  username;
        this.password = password;
   //     this.staff = staff;
    }
    
    //Method
    
    //Getter dan Setter Username
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    //Getter dan Setter Password
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    //Getter dan Setter Staff
 /*   public Staff getStaff()
    {
        return staff;
    }
    
    public void setStaff(Staff staff)
    {
        this.staff = staff;
    }*/
    
}
