    /*
 Karyawan adalah superclass dari Manajer dan Staff
 Manajer dan Staff menyusun departemen
 divisi : 
 */
package model.karyawan;
import model.Departemen;

/**
 *
 * @author A412DA
 */
public abstract class Karyawan {
    protected String idKaryawan;
    protected String namaKaryawan;
    protected float gaji;
    protected AkunKaryawan akunKaryawan;
    protected Departemen departemen;

    public Karyawan(String idKaryawan, String namaKaryawan, float gaji, AkunKaryawan akunKaryawan, Departemen departemen) {
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

    public float getGaji() {
        return gaji;
    }

    public void setGaji(float gaji) {
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
