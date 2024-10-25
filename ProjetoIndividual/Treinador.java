package ProjetoIndividual;

public class Treinador extends Pessoa{
    private String clubeAtual;
    private int anosExperiencia;
    private String estiloJogo;
    private Double salario;
    
    public Treinador (String nome, String nacionalidade, int idade, String clubeAtual, int anosExperiencia, String estiloJogo, Double salario){
        super(nome, nacionalidade, idade);
        this.clubeAtual = clubeAtual;
        this.anosExperiencia = anosExperiencia;
        this.estiloJogo = estiloJogo;
        this.salario = salario;

        
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getEstiloDeJogo() {
        return estiloJogo;
    }

    public void setEstiloDeJogo(String estiloDeJogo) {
        this.estiloJogo = estiloDeJogo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }




}
