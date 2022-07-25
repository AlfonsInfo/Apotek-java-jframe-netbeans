    /*
 Karyawan adalah superclass dari Manajer dan Staff
 Manajer dan Staff menyusun suatu divisi
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
   protected String jenisKelamin;
   protected String alamat;
   protected String tanggalMasuk;
   protected int masaKerja;
   protected AkunKaryawan akunKaryawan;
   protected Departemen departemen;
   protected float gaji;
   
   public Karyawan(String idKaryawan, String namaKaryawan, String jenisKelamin, String alamat, String tanggalMasuk,AkunKaryawan akunKaryawan, Departemen departemen, float gaji)
   {
       this.idKaryawan = idKaryawan;
       this.namaKaryawan = namaKaryawan;
       this.jenisKelamin = jenisKelamin;
       this.alamat = alamat;
       this.tanggalMasuk = tanggalMasuk;
       this.akunKaryawan = akunKaryawan;
       this.departemen = departemen;
       this.gaji = gaji;
   }
           
   public String getID()
   {
       return idKaryawan;
   }
   
   public void setID(String idKaryawan)
   {
       this.idKaryawan = idKaryawan;
   }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public AkunKaryawan getAkunKaryawan() {
        return akunKaryawan;
    }

    public void setAkunKaryawan(AkunKaryawan akunKaryawan) {
        this.akunKaryawan = akunKaryawan;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public float getGaji() {
        return gaji;
    }

    public void setGaji(float gaji) {
        this.gaji = gaji;
    }
   
    
}
