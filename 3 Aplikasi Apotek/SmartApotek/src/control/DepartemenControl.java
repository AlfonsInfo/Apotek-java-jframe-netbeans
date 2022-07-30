package control;

import dao.DepartemenDAO;
import java.util.List;
import model.Departemen;
import table.TableFormKaryawan.TableDepartemen;
public class DepartemenControl {
    //Field
    private DepartemenDAO ddao = new DepartemenDAO();
    
    
    //Method
    public void insertDepartemen(Departemen d)
    {
        ddao.insertDepartemen(d);
    }
    
    //Show Ketabel
    public TableDepartemen showDepartemen(String query)
    {
        List<Departemen> dataDepartemen = ddao.showDepartemen();
        TableDepartemen tableDepartemen = new TableDepartemen(dataDepartemen);
        
        return tableDepartemen;
    }
    
    //Show Ke Drop down FORM CRUDKaryawan
    public List<Departemen> showListAllDepartemen()
    {
        List<Departemen> dataDepartemen = ddao.showDepartemen();
        return dataDepartemen;
    }
    
    //Update Data
    public void updateDepartemen(Departemen d){
        ddao.updateDepartemen(d);
    }
    
    //Hapus Data
    public void deleteDepartemen(String id)
    {
        ddao.deleteDepartemen(id);
    }
    
}
