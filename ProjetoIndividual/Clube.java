package ProjetoIndividual;


public class Clube {
    private String cidade;
    private String estadio;
    private Double orcamento;
    private int totalSocios;
    private String diretor;
    private String presidente;
    private double valorMercado;
    private int capacidadeEstadio;

    public Clube(int capacidadeEstadio, String cidade, String diretor, String estadio, Double orcamento, String presidente, int totalSocios, double valorMercado) {
        this.capacidadeEstadio = capacidadeEstadio;
        this.cidade = cidade;
        this.diretor = diretor;
        this.estadio = estadio;
        this.orcamento = orcamento;
        this.presidente = presidente;
        this.totalSocios = totalSocios;
        this.valorMercado = valorMercado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public int getTotalSocios() {
        return totalSocios;
    }

    public void setTotalSocios(int totalSocios) {
        this.totalSocios = totalSocios;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getCapacidadeEstadio() {
        return capacidadeEstadio;
    }

    public void setCapacidadeEstadio(int capacidadeEstadio) {
        this.capacidadeEstadio = capacidadeEstadio;
    }

    






}

    








    
