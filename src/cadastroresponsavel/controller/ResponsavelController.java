package cadastroresponsavel.controller;

import cadastroresponsavel.bd.ResponsavelDAO;
import cadastroresponsavel.model.Responsavel;


public class ResponsavelController{
  private ResponsavelDAO dao= new ResponsavelDAO();
  public ResponsavelController(){

  }
  public void cadastrarResponsavel(Responsavel rp){
    dao.inserir(rp);
  }
}
