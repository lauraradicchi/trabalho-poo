package cadastroresponsavel.bd;

import cadastroresponsavel.model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class ResponsavelDAO{
    private ConnectionFactory cf = new ConnectionFactory();
    private PreparedStatement stm = null;
    private ResultSet rs = null;  
    private Connection con = null;

    public ResponsavelDAO() {
    }
    
  public void inserir(Responsavel rp){
    try{
      con = cf.obterConexao();
      stm = con.prepareStatement("INSERT INTO responsavel (nomeResponsavel,dataNascimento,telefoneResponsavel) VALUES (?,?,?)");
      stm.setString(1,rp.getNomeResponsavel());
      stm.setString(2,rp.getDataNasc());
      stm.setString(3,rp.getTelefoneResponsavel());
      stm.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
