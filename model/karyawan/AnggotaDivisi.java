package model.karyawan;

import model.Departemen;

/**
 *
 * @author A412DA
 */
public class AnggotaDivisi extends Karyawan implements IComposite{
    
    private String idAnggota;
    private String jabatan;
    public AnggotaDivisi(String idKaryawan, String namaKaryawan, String jenisKelamin, String alamat, String tanggalMasuk,AkunKaryawan akunKaryawan, Departemen departemen, float gaji, String jabatan)
    {
        super(idKaryawan, namaKaryawan, jenisKelamin, alamat, tanggalMasuk, akunKaryawan, departemen, gaji);
        this.idAnggota = idKaryawan;
        this.jabatan = jabatan;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
        

    public String getJabatan()
    {
        return jabatan;
    }
    
    public void setJabatan(String jabatan)
    {
        this.jabatan = jabatan;
    }
    
    @Override
    public void showData() {
        System.out.println(namaKaryawan +" - "+jabatan);
    }
    
}
