package cadastroresponsavel.model;
import java.util.*;

public class Administrador{
  public Administrador(){

  }
  private String email;
  private String senha;

  public String getSenha(){
    return senha;
  }
  public void setSenha(String senha){
    this.senha=senha;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.emai= email;
  }
}
