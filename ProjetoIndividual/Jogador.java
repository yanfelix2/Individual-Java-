package ProjetoIndividual;

public class Jogador {
    public String nome;
    public String nacionalidade;
    public Double salario;
    public Double altura;
    public Double peso;
    public int numeroCamisa;
    public String posicao;
    public String clubeAtual;

    public Jogador(String nome, String nacionalidade, Double salario, Double altura, Double peso, int numeroCamisa,
    String posicao, String clubeAtual) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.salario = salario;
        this.altura = altura;
        this.peso = peso;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
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
