import ProjetoIndividual.Classes.Jogador;
import ProjetoIndividual.Classes.Treinador;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Yan", "Brasileiro", 20, "Atacante", 7, 100000.20, "Vasco");
        Treinador treinador = new Treinador("Fulano", "Árabe", 54, "Flamengo", 20, "Ofensivo", 3000.0);

        System.out.println(jogador.exibirInformacoes());
        System.out.println();
        System.out.println(treinador.exibirInformacoes());
        
        
    
        
        
        
    }
    
}
