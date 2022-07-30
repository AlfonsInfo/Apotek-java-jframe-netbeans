/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import model.Obat;

public class TableObatForCustomer extends AbstractTableModel{

    private List<Obat> list;
    
    public TableObatForCustomer(List<Obat> list)
    {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columIndex) {
        {
            switch(columIndex)
            {
                case 0:
                    return list.get(rowIndex).getNamaObat();
                case 1:
                    return list.get(rowIndex).getSediaan();
                case 2:
                    return list.get(rowIndex).getKhasiat();
                case 3:
                    return list.get(rowIndex).getHargaJual();
                case 4:
                    return list.get(rowIndex).getStok();
                case 5:
                    return list.get(rowIndex).getKodeObat();
                default:
                    return null;
            }
        }
    }

    public String getColumnName(int column)
    {
        switch(column)
        {
            case 0:    
                return "Nama Obat";
            case 1:    
                return "Sediaan";
            case 2:    
                return "Khasiat";
            case 3:    
                return "Harga ";
            case 4:   
                return "Stok";
        //    case 5:
          //      return  "Kode Obat";
            default:
                return null;
        }
    }    
}
