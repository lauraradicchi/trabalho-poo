package cadastroresponsavel.bd;

import cadastroresponsavel.model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class ResponsavelDAO{
  public void inserir(Responsavel rp){
    try{
      ConnectionFactory cf = new ConnectionFactory();
      Connection con = cf.obterConexao();
      PreparedStatement stm = con.prepareStatement("INSERT INTO responsavel (nomeResponsavel,telefoneResponsavel) VALUES (?,?)");
      stm.setString(1,rp.getNomeResponsavel());
      stm.setString(2,rp.getTelefoneResponsavel());
      stm.executeUpdate();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
