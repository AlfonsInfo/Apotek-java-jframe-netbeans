package control;

import dao.StafDAO;
import dao.KaryawanDAO;
import java.util.List;
import model.karyawan.*;
import table.TableFormKaryawan.TableStaf;

public class StafControl {
     
    public void insertStaf(Staf m)
    {
        kdao.insertStaf(m);
    }
    
    private StafDAO kdao = new StafDAO();
   
        public TableStaf showStaf(String query)
    {
        List<Staf> dataStaf = kdao.showStaf("query");
        TableStaf tableStaf = new TableStaf(dataStaf);
        
        return tableStaf;
    }
        
    public void deleteStaf(String id)
    {
        kdao.deleteStaf(id);
    }
}
