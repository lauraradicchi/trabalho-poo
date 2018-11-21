/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.controller;

import cadastroresponsavel.bd.UsuarioDAO;
import cadastroresponsavel.model.Usuario;
import java.util.List;

/**
 *
 * @author Laura
 */
public class UsuarioController {
    private UsuarioDAO dao = new UsuarioDAO();

    public UsuarioController() {
    }
    
    public void alterarSenha(Usuario u){
        dao.atualizarSenha(u);
    }
    public boolean login(Usuario u){
        return dao.login(u);
        
    }
    public void inserir (Usuario u){
        dao.inserir(u);
    }
    public String exibirNomeUsuario(Usuario u){
        return dao.nomeUsuario(u);
    }
    public boolean login (Usuario u){
        dao.login(u);
    }
}
