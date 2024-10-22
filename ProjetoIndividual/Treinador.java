package ProjetoIndividual;

public class Treinador extends Pessoa {
    private String formacao;
    private String clubeAtual;

    public Treinador(String nome, String nacionalidade, int idade, String formacao, String clubeAtual) {
        super(nome, nacionalidade, idade);
        this.formacao = formacao;
        this.clubeAtual = clubeAtual;
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
