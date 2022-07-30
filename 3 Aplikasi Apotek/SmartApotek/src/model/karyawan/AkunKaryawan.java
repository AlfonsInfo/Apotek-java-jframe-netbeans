package model.karyawan;

/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class AkunKaryawan {
    //Field
    private String username;
    private String password;
    private String noHp;
    private String emailKaryawan;
 //   private Staff staff;
    
    //Constructor
    public AkunKaryawan(String username, String password)
    {
        this.username =  username;
        this.password = password;
   //     this.staff = staff;
    }

    public AkunKaryawan(String username, String password, String noHp, String emailKaryawan) {
        this.username = username;
        this.password = password;
        this.noHp = noHp;
        this.emailKaryawan = emailKaryawan;
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

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmailKaryawan() {
        return emailKaryawan;
    }

    public void setEmailKaryawan(String emailKaryawan) {
        this.emailKaryawan = emailKaryawan;
    }
    
    
}
