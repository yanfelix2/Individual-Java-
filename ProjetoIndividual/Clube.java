package ProjetoIndividual;


public class Clube {
    private String nome;
    private String nomePresidente;
    private String numeroContato;
    private String estadio;  

    public Clube(String nome, String nomePresidente, String numeroContato, String estadio){
        this.nome = nome;
        this.nomePresidente = nomePresidente;
        this.numeroContato = numeroContato;
        this.estadio = estadio;
    }

        //GET E SET ---Nome Do Clube--- // 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


        //GET E SET ---NomeDoPresidente---// 


    public String getNomePresidente() {
        return nomePresidente;
    }

    public void setNomePresidente(String nomePresidente){
        this.nomePresidente = nomePresidente;
    }

        //GET E SET ---Numero Contato---//

    
    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato){
        this.numeroContato = numeroContato;
    }

        //GET E SET ---Estadio---//


    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }


    

    








    
}
