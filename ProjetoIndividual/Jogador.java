package ProjetoIndividual;

public class Jogador extends Pessoa {
    private Double salario;
    private Double altura;
    private Double peso;
    private int numeroCamisa;
    private String posicao;
    private String clubeAtual;

    public Jogador(String nome, String nacionalidade, int idade, Double salario, Double altura, Double peso, 
                   int numeroCamisa, String posicao, String clubeAtual) {
        super(nome, nacionalidade, idade);
        this.salario = salario;
        this.altura = altura;
        this.peso = peso;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.clubeAtual = clubeAtual;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }
}
