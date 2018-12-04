/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import cadastroresponsavel.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Laura
 */
public class AlunoDAO {
    private   ConnectionFactory cf = new ConnectionFactory();
    private  PreparedStatement stm = null;  
    private  Connection con=null;
    
    public void inserir(Aluno a){
        try{
            con=cf.obterConexao();
            stm=con.prepareStatement("INSERT INTO aluno (prontuario,nome,dataNasc,telefone) values(?,?,?,?)");
            stm.setString(1, a.getProntuario());
            stm.setString(2, a.getNome());
            stm.setString(3,a.getDataNascimento());
            stm.setString(4, a.getTelefone());
            stm.executeUpdate();
        }catch(SQLException ex){
             throw new RuntimeException("Exceção: " + ex);
        }
    }

    
}
