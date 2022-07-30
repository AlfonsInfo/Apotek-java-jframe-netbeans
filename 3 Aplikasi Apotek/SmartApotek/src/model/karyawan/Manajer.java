//Manajer merupakan inheritance dari Karyawan ( Subclass dari karyawan)
package model.karyawan;

import model.Departemen;

/**
 *
 * @author Alfonsus Setiawan jacub
 */
public class Manajer extends  Karyawan {
    private double tunjangan;

    public Manajer(double tunjangan, String idKaryawan, String namaKaryawan, double gaji, AkunKaryawan akunKaryawan, Departemen departemen) {
        super(idKaryawan, namaKaryawan, gaji, akunKaryawan, departemen);
        this.tunjangan = tunjangan;
    }


    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    
    
}
