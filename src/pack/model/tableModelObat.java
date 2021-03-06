/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Louisa
 */
public class tableModelObat extends AbstractTableModel {
    List<m_obat> lt;

    public tableModelObat(List<m_obat> lt) {
        this.lt = lt;
    }

    @Override
    public int getRowCount() {
        return lt.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Obat";
            case 1:
                return "Nama Obat";
            case 2:
                return "Kategori Obat";
            case 3:
                return "Jenis Packaging";
            case 4:
                return "Harga Obat";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lt.get(row).getkode();
            case 1:
                return lt.get(row).getnama();
            case 2:
                return lt.get(row).getkategori();
            case 3:
                return lt.get(row).getjenis();
            case 4:
                return lt.get(row).getharga();
            default:
                return null;
        }
    }
}
