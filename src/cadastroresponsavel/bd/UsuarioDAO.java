package cadastroresponsavel.bd;

import cadastroresponsavel.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UsuarioDAO{
    private  ConnectionFactory cf = new ConnectionFactory();
    private  PreparedStatement stm = null;  
    private  Connection con=null;
    private  ResultSet rs =null;

    public UsuarioDAO() {
    }
  
    public void inserir(Usuario u){
        try{
            con = cf.obterConexao();
            stm = con.prepareStatement("INSERT INTO usuario (nome,prontuario,senha) values (?,?,?)");
            stm.setString(1,u.getNome());
            stm.setString(2, u.getProntuario());
            stm.setString(3,u.getSenha());
            stm.executeUpdate();
        }catch (SQLException ex) {
             throw new RuntimeException("Exceção: " + ex);
        }    
    
    }
    public void atualizarSenha(Usuario u){
        try{
            con=cf.obterConexao();
            stm=con.prepareStatement("UPDATE usuario SET senha = ? where prontuario = ?");
            stm.setString(1, u.getSenha());
            stm.executeUpdate();
        }catch(SQLException ex){
            throw new RuntimeException("Exceção: " + ex);
        } 
    }  
    
    public boolean login (Usuario u){
       String user, senha;
       String userName = u.getProntuario();
       String pass= u.getSenha();
        try{
            con= cf.obterConexao();
            stm = con.prepareStatement("SELECT prontuario,senha FROM usuario where prontuario =?");
            stm.setString(1, u.getProntuario());
            rs=stm.executeQuery();
            while(rs.next()){
               user= rs.getString("prontuario");
               senha= rs.getString("senha");
            if(userName.equals(user) && pass.equals(senha))
               return true;  
            }   
        }catch(SQLException ex){
            throw new RuntimeException("Exceção: " + ex);
        } 
        return false;
    }
}
