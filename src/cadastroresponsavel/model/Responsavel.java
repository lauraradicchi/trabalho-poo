package cadastroresponsavel.model;
import java.util.*;



public class Responsavel{
    public Responsavel(){

    }
    private String nomeResponsavel;
    private String telefoneResponsavel;
    private String dataNasc; 

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefoneResponsavel(){
      return telefoneResponsavel;
    }
    public void setTelefoneResponsavel(String telefoneResponsavel){
      this.telefoneResponsavel=telefoneResponsavel;
    }
    public String getNomeResponsavel(){
      return nomeResponsavel;
    }
    public void setNomeResponsavel(String telefoneResponsavel){
      this.telefoneResponsavel=telefoneResponsavel;
    }
}
