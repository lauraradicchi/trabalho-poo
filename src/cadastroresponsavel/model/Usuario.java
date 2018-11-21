package cadastroresponsavel.model;
import java.util.*;

public class Usuario implements Comparable<Usuario>{
  public Usuario(){

  }
  private String nome;
  private String prontuario;
  private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha=senha;
    }
    
    public String getProntuario(){
        return prontuario;
    }
    
    public void setProntuario(String prontuario){
        this.prontuario= prontuario;
    }

    @Override
    public int compareTo(Usuario o) {
        
        return this.getSenha().compareTo(o.getSenha());
    }
    public boolean equals(Usuario o){
        if(o instanceof Usuario){
            Usuario usuario =(Usuario) o;
            return this.getSenha().equals(usuario.getSenha());
        }
        return false;
    }
    
    
}
