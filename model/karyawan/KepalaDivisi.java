/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.karyawan;

import java.util.ArrayList;
import model.Departemen;

/**
 *
 * @author A412DA
 */
public class KepalaDivisi extends Karyawan implements IComposite{

    private String idKepalaDivisi;
    private String namaJabatan;
    private ArrayList<IComposite> bawahan;
    
    public KepalaDivisi(String idKaryawan, String namaKaryawan, String jenisKelamin, String alamat, String tanggalMasuk,AkunKaryawan akunKaryawan, Departemen departemen, float gaji)
    {      
        super(idKaryawan, namaKaryawan, jenisKelamin, alamat, tanggalMasuk, akunKaryawan, departemen, gaji);
        this.idKepalaDivisi = idKaryawan;
        this.namaJabatan = "Manajer";
        this.bawahan = new ArrayList<IComposite>();
    }

    public String getIdKepalaDivisi() {
        return idKepalaDivisi;
    }

    public void setIdKepalaDivisi(String idKepalaDivisi) {
        this.idKepalaDivisi = idKepalaDivisi;
    }

    
    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }
    
        
    public void tambahBawahan(IComposite comp)
    {
        bawahan.add(comp);
    }
    @Override
    public void showData() {
        
    }
    
}
