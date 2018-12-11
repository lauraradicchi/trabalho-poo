package cadastroresponsavel.bd;

import cadastroresponsavel.model.Responsavel;
import cadastroresponsavel.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ResponsavelDAO{
    private   ConnectionFactory cf = new ConnectionFactory();
    private  PreparedStatement stm = null;  
    private  Connection con=null;
    private ResultSet rs = null;  

  
    
  public void inserir(Responsavel rp){
    try{  
      con = cf.obterConexao();
      stm = con.prepareStatement("INSERT INTO responsavel (cod_aluno,nomeResponsavel,dataNascimento,telefoneResponsavel) VALUES (?,?,?,?)");
      stm.setString(1, rp.getAluno().getProntuario());
      stm.setString(2,rp.getNomeResponsavel());
      stm.setString(3,rp.getDataNasc());
      stm.setString(4,rp.getTelefoneResponsavel());
      stm.executeUpdate();
    }catch (SQLException ex) {
        throw new RuntimeException("Exceção: " + ex);
    }
  }
  
  public List<Responsavel> recuperarPais(Aluno a) {
     List<Responsavel> r = new ArrayList();
     try{
        con= cf.obterConexao();
        stm=con.prepareStatement("SELECT nomeResponsavel,telefoneResponsavel from responsavel where cod_aluno=?");
        stm.setString(1, a.getProntuario());
        rs= stm.executeQuery();
        while(rs.next()){
            Responsavel rp= new Responsavel();
            rp.setAluno(a);
            rp.setNomeResponsavel("nomeResponsavel");
            rp.setTelefoneResponsavel("telefoneResponsavel");
            r.add(rp);
        }
        
    }catch(SQLException ex){
        throw new RuntimeException("Exceção: " + ex);
    }
     return r;
  }
   public void remover (Responsavel r){
       try{
          con= cf.obterConexao();
          stm=con.prepareStatement("DELETE FROM responsavel where cod_aluno=?");
          stm.setString(1, r.getAluno().getProntuario());
          stm.executeUpdate();
           
        }catch(SQLException ex){
            throw new RuntimeException("Exceção: " + ex);
        }
    }
  
}
