package control;


import table.TableFormKaryawan.TableStokObat;
import dao.ObatDAO;
import model.Obat;
import java.util.List;
import table.TableObatForCustomer;
public class ObatControl {
    private ObatDAO oDAO = new ObatDAO();
    
    public void insertObat(Obat O)
    {
        oDAO.insertObat(O);
    }
    
    public TableStokObat showObat(String query)
    {
        List<Obat> dataObat = oDAO.showObat(query);
        TableStokObat tableObat = new TableStokObat(dataObat);
        
        return tableObat;
    }
    
    public TableObatForCustomer showObatToCustomer(String query)
    {
        List<Obat> dataObat = oDAO.showObat(query);
        TableObatForCustomer tableObatForCustomer = new TableObatForCustomer(dataObat);
        
        return tableObatForCustomer;
    }
    
    public void updateObat(Obat o, String kode)
    {
        oDAO.updateObat(o, kode);
    }
    
    public void deleteObat(String kode)
    {
         oDAO.deleteObat(kode);
    }
}
