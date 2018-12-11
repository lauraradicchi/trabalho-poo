package cadastroresponsavel.model;




public class Responsavel{
    public Responsavel(){

    }
    private String nomeResponsavel;
    private String dataNasc; 
    private String telefoneResponsavel;
    private String tipoResponsavel;
    private Aluno aluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    

    public String getTipoResponsavel() {
        return tipoResponsavel;
    }

    public void setTipoResponsavel(String tipoResponsavel) {
        this.tipoResponsavel = tipoResponsavel;
    }
   

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
    