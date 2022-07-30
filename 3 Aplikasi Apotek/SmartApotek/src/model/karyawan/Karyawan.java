    /*

 divisi : 
 */
package model.karyawan;
import model.Departemen;

/**
 *
 * @author A412DA
 */

/*
 Karyawan adalah superclass dari Manajer dan Staff
 Manajer dan Staff menyusun departemen
*/
public class Karyawan {
    protected String idKaryawan;
    protected String namaKaryawan;
    protected double gaji;
    protected AkunKaryawan akunKaryawan;
    protected Departemen departemen;

    public Karyawan(String idKaryawan, String namaKaryawan, double gaji, AkunKaryawan akunKaryawan, Departemen departemen) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.gaji = gaji;
        this.akunKaryawan = akunKaryawan;
        this.departemen = departemen;
    }
    
    //Getter dan Setter idKaryawan

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    //Getter dan Setter namaKaryawan

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }
    //Getter dan Setter gaji

    public double getGaji() {
       // return String.valueOf(gaji);
       return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
        
    //Getter dan Setter akunKaryawan
    
    public AkunKaryawan getAkunKaryawan() {
        return akunKaryawan;
    }

    public void setAkunKaryawan(AkunKaryawan akunKaryawan) {
        this.akunKaryawan = akunKaryawan;
    }

    //Getter dan Setter departemmen
    
    public Departemen getDepartemen() {
        return departemen;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    
}
