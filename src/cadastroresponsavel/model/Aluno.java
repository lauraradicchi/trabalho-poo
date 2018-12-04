/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Laura
 */
public class Aluno extends Observable
    implements Comparable<Aluno> {
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String prontuario;
    
    private List<Responsavel> responsavel = new ArrayList();

    public List<Responsavel> getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(List<Responsavel> responsavel) {
        this.responsavel = responsavel;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
        this.setChanged();
        this.notifyObservers();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void adcionarResp(Responsavel rp){
        responsavel.add(rp);
        rp.setAluno(this);
    }

    @Override
    public int compareTo(Aluno a1) {
        return this.getNome().compareTo(a1.getNome());
    }
    
  
    
}
