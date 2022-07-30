/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package table.TableFormKaryawan;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.karyawan.*;

public class TableStaf extends AbstractTableModel{

      private List<Staf> list;   
    
    public TableStaf(List<Staf> list)
    {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public  Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0:
                return list.get(rowIndex).getIdKaryawan();
            case  1:
                return list.get(rowIndex).getNamaKaryawan();
            case  2: 
                return list.get(rowIndex).getGaji();
            case 3:
                return list.get(rowIndex).getNamaBidang();
            case 4:
                return list.get(rowIndex).getAkunKaryawan().getUsername();
            case 5:
                return list.get(rowIndex).getDepartemen().getNamaDepartemen();
            default :
                return null;
        }
    }
    
    public String getColumnName(int column)
    {
        switch(column)
        {
            case 0:
                return "ID Karyawan";
            case 1:
                 return "Nama Karyawan";
            case 2:
                return "Gaji";
            case 3:
                return "Bidang";
            case 4:
                return "Username";
            case 5:
                return "Nama Departemen";
            default:
                return null;
        }
    }
    
    
}
