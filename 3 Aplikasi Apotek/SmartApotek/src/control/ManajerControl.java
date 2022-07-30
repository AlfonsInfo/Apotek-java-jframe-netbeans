package control;


import dao.ManajerDAO;
import java.util.List;
import model.karyawan.*;
import table.TableFormKaryawan.TableManajer;

public class ManajerControl {
    private ManajerDAO kdao = new ManajerDAO();
    
    public void insertManajer(Manajer m)
    {
        kdao.insertManajer(m);
    }
    
    
    public TableManajer showManajer(String query)
    {
        List<Manajer> dataManajer = kdao.showManajer("query");
        TableManajer tableManajer = new TableManajer(dataManajer);
        
        return tableManajer;
    }
    
    public void updateManajer(Manajer m)
    {
        kdao.updateManajer(m);
    }
    
    public void deleteManajer(String id)
    {
        kdao.deleteManajer(id);
    }
    
}
