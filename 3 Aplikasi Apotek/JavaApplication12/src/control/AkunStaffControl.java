/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.AkunStaff;
import dao.AkunStaffDAO;

/**
 *
 * @author A412DA
 */
public class AkunStaffControl {
    private AkunStaffDAO asDAO = new AkunStaffDAO();
    
    public AkunStaff searchAkunStaff(String username, String password)
    {
        AkunStaff as = null;
        as = asDAO.searchAkunStaff(username, password);
        return as;
    }
    
}
