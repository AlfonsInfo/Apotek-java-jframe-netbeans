package table.TableFormKaryawan;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Departemen;

public class TableDepartemen extends AbstractTableModel{
    private List<Departemen> list;
     
    public  TableDepartemen(List<Departemen> list)
    {
        this.list = list;
    }

    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0 :
                return list.get(rowIndex).getIdDepartemen();
            case 1 :
                return list.get(rowIndex).getNamaDepartemen();
            default :
                return null;
        }
    }
    
    public String getColumnName(int column)
    {
        switch(column)
        {
            case 0:
                return "ID Departemen";
            case 1:
                return "Nama Departemen";
            default:
                return null;
        }
    }
    
}
