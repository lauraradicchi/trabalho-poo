package cadastroresponsavel.model;
import java.util.*;

public class Administrador{
  public Administrador(){

  }
  private String prontuario;
  private String senha;

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
}
