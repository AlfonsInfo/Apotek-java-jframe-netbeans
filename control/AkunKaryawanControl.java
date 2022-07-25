/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.karyawan.AkunKaryawan;
import dao.AkunKaryawanDAO;

/**
 *
 * @author A412DA
 */
public class AkunKaryawanControl {
    private AkunKaryawanDAO asDAO = new AkunKaryawanDAO();
    
    public AkunKaryawan searchAkunKaryawan(String username, String password)
    {
        AkunKaryawan akunstaff = null;
        akunstaff = asDAO.searchAkunStaff(username, password);
        return akunstaff;
    }
    
}
