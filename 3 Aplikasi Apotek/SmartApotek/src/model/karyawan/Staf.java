//Staff merupakan subclass atau inheritance dari kelas Karyawan

package model.karyawan;

import model.Departemen;

/**
 *
 * @author Alfonsus Setiawan Jacub
 */
public class Staf extends Karyawan{
    private String namaBidang;

    public Staf(String namaBidang, String idKaryawan, String namaKaryawan, double gaji, AkunKaryawan akunKaryawan, Departemen departemen) {
        super(idKaryawan, namaKaryawan, gaji, akunKaryawan, departemen);
        this.namaBidang = namaBidang;
    }
    
    public String getNamaBidang() {
        return namaBidang;
    }

    public void setNamaBidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }
    
    

    
}
