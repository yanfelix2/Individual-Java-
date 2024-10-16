package ProjetoIndividual;


public class Treinador {
    private String nome;
    private String nacionalidade;
    private String formacao;
    private String clubeAtual;

public Treinador(String nome, String nacionalidade, String formacao, String clubeAtual){
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.formacao = formacao;
    this.clubeAtual = clubeAtual;
}


    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }



    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }



    public String getClubeAtual() {
        return clubeAtual;
    }


    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

        
    


    
    
}
