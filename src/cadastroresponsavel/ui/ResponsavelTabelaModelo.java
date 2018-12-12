/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.controller.ResponsavelController;
import cadastroresponsavel.model.Responsavel;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Laura
 */
public class ResponsavelTabelaModelo  extends AbstractTableModel
    implements Observer{
    private List<Responsavel> responsavel;
    private String [] colunas ={"nome", "telefone"};

    public ResponsavelTabelaModelo(List<Responsavel> responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public int getRowCount() {
       return responsavel.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

     @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Responsavel rp = responsavel.get(rowIndex);
        switch(columnIndex){
            case 0:
                return rp.getNomeResponsavel();
            case 1:
                return rp.getTelefoneResponsavel();
            default:
                  return "dado inválido";  
        }
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
    
}
