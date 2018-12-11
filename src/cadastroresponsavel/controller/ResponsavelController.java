package cadastroresponsavel.controller;

import cadastroresponsavel.bd.ResponsavelDAO;
import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.util.List;


public class ResponsavelController{
  
    private ResponsavelDAO dao= new ResponsavelDAO();
  
    public ResponsavelController(){
    }
  
    public void cadastrarResponsavel(Responsavel rp){
        dao.inserir(rp);
    }
    
    
    public void removerResponsavel(Responsavel r){
        dao.remover(r);
    }
}
