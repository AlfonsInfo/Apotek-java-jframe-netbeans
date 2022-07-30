package table.TableFormKaryawan;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Obat;
public class TableStokObat extends AbstractTableModel{
    private List<Obat> list;
    
    public TableStokObat(List<Obat> list)
    {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columIndex) {
        {
            switch(columIndex)
            {
                case 0:
                    return list.get(rowIndex).getKodeObat();
                case 1:
                    return list.get(rowIndex).getNamaObat();
                case 2:
                    return list.get(rowIndex).getSediaan();
                case 3:
                    return list.get(rowIndex).getKhasiat();
                case 4:
                    return list.get(rowIndex).getHargaJual();
                case 5:
                    return list.get(rowIndex).getModal();
                case 6:
                    return list.get(rowIndex).getStok();
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
                return "Kode Obat";
            case 1:    
                return "Nama Obat";
            case 2:    
                return "Sediaan";
            case 3:    
                return "Khasiat";
            case 4:    
                return "Harga Jual";
            case 5:    
                return "Modal";
            case 6:   
                return "Stok";
            default:
                return null;
        }
    }
}
