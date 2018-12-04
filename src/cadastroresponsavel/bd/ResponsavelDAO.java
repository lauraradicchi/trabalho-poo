package cadastroresponsavel.bd;

import cadastroresponsavel.model.Responsavel;
import cadastroresponsavel.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ResponsavelDAO{
    private   ConnectionFactory cf = new ConnectionFactory();
    private  PreparedStatement stm = null;  
    private  Connection con=null;

  
    
  public void inserir(Responsavel rp){
    try{  
      con = cf.obterConexao();
      stm = con.prepareStatement("INSERT INTO responsavel (cod_aluno,nomeResponsavel,dataNascimento,telefoneResponsavel) VALUES (?,?,?)");
      stm.setString(1, rp.getAluno().getProntuario());
      stm.setString(2,rp.getNomeResponsavel());
      stm.setString(3,rp.getDataNasc());
      stm.setString(4,rp.getTelefoneResponsavel());
      stm.executeUpdate();
    }catch (SQLException ex) {
        throw new RuntimeException("Exceção: " + ex);
    }
  }
}
