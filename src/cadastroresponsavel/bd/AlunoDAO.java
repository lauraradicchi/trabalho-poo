/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.bd;

import cadastroresponsavel.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Laura
 */
public class AlunoDAO {
    private  ConnectionFactory cf = new ConnectionFactory();
    private  PreparedStatement stm = null;  
    private  Connection con=null;
    private  ResultSet rs = null;
    private  ResponsavelDAO rdao = new ResponsavelDAO();
    
    public void inserir(Aluno a){
        try{
            con=cf.obterConexao();
            stm=con.prepareStatement("INSERT INTO aluno (prontuario,nome,dataNasc,telefone) values(?,?,?,?)");
            stm.setString(1, a.getProntuario());
            stm.setString(2, a.getNome());
            stm.setString(3,a.getDataNasc());
            stm.setString(4, a.getTelefone());
            stm.executeUpdate();
        }catch(SQLException ex){
             throw new RuntimeException("Exceção: " + ex);
        }
    }
    public List visualizarAlunos(){
        try{
           List a = new LinkedList();
           con = cf.obterConexao();
            stm = con.prepareStatement("SELECT * FROM aluno");
            rs = stm.executeQuery();
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setProntuario(rs.getString("prontuario"));
                aluno.setNome(rs.getString("nome"));
                aluno.setDataNasc(rs.getString("dataNasc"));
                aluno.setTelefone(rs.getString("telefone"));
                List responsavel = rdao.recuperarPais(aluno);
                aluno.setResponsavel(responsavel);
                a.add(aluno);
                
            }
           return a; 
        }catch(SQLException ex){
            throw new RuntimeException("Exceção: " +ex);
            
        }
    }
    public void remover(Aluno a){
        try{
            con = cf.obterConexao();
            stm= con.prepareStatement("DELETE FROM aluno where prontuario=?");
            stm.setString(1,a.getProntuario());
            stm.executeUpdate();
            
        }catch(SQLException ex){
           throw new RuntimeException("Exceção: " +ex);   
        }
    }
    
    public void alterar(Aluno a){
        try{
            con=cf.obterConexao();
            stm=con.prepareStatement("UPDATE aluno set nome=?, dataNasc=?, telefone=? where prontuario=?");
            stm.setString(1, a.getNome());
            stm.setString(2, a.getDataNasc());
            stm.setString(3, a.getTelefone());
            stm.setString(3, a.getProntuario());
        }catch(SQLException ex){
           throw new RuntimeException("Exceção: " +ex);   
        }
    }

    
}
