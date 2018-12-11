/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Laura
 */
public class AlunoTableModelo  extends AbstractTableModel
    implements Observer {
    
    private List<Aluno> alunos;
    private List<Responsavel> responsavel;
    private String[] colunas = {"Prontuario", "Nome", "Responsável"};
    
    public AlunoTableModelo(List<Aluno> a) {
        alunos = a;
        Iterator<Aluno> i = alunos.iterator();
        while (i.hasNext()) {
            Aluno aluno = i.next();
            aluno.addObserver(this);
        }
    }
    
    @Override
    public int getRowCount() {
       return alunos.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Aluno a1= alunos.get(rowIndex);
          switch(columnIndex) {
            case 0:
                return a1.getProntuario();
            case 1:
                return a1.getNome();
            case 2:
                return a1.getResponsavel();
            default:
                return "Dado inválido";
        }
    }
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

     @Override 
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.fireTableDataChanged();
    }
}
