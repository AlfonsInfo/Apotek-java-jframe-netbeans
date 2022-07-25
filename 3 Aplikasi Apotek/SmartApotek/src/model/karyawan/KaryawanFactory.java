package model.karyawan;

import model.Departemen;

public class KaryawanFactory {
    public Karyawan createKaryawan(String jenis,String idKaryawan, String namaKaryawan, String jenisKelamin, String alamat, String tanggalMasuk,AkunKaryawan akunKaryawan, Departemen departemen, float gaji,String jabatan)
    {
        if(jenis.equalsIgnoreCase("KepalaDivisi")){
           return   new KepalaDivisi(idKaryawan, namaKaryawan, jenisKelamin, alamat, tanggalMasuk, akunKaryawan, departemen, gaji);
        }else if(jenis.equalsIgnoreCase("AnggotaDivisi"))
        {
            return new AnggotaDivisi(idKaryawan, namaKaryawan, jenisKelamin, alamat, tanggalMasuk, akunKaryawan, departemen, gaji, jabatan);
        }
        return null;
    }
    
}
