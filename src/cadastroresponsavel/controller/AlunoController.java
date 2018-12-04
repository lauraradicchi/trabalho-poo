/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;
import cadastroresponsavel.bd.AlunoDAO;
import cadastroresponsavel.model.Aluno;

/**
 *
 * @author Laura
 */
public class AlunoController {
    private AlunoDAO dao = new AlunoDAO();
    public void inserir(Aluno a){
        dao.inserir(a);
    }
    
    
}
