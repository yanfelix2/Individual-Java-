package ProjetoIndividual;


public class Jogador extends Pessoa{
    private String posicao;
    private int numeroCamisa;
    private Double salario;
    private String clubeAtual;



    public Jogador(String nome, String nacionalidade, int idade, String posicao, int numeroCamisa, double salario, String clubeAtual){
        super(nome, nacionalidade, idade);
        this.salario = salario;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.clubeAtual = clubeAtual;
    }


    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }
                 

}