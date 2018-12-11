/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;
import cadastroresponsavel.bd.AlunoDAO;
import cadastroresponsavel.model.Aluno;
import java.util.List;

/**
 *
 * @author Laura
 */
public class AlunoController {
    private AlunoDAO dao = new AlunoDAO();
    public void inserir(Aluno a){
        dao.inserir(a);
    }
    public List visualizarAlunos(){
        return dao.visualizarAlunos();
    }
    public void remover(Aluno a){
        dao.remover(a);
    }
    public void alterar(Aluno a){
        dao.alterar(a);
    }
    
    
}
