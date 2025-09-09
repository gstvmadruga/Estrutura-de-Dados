package controle;
import modelo.Jogador;
import modelo.Time;

public class controlaTime {
	private Jogador jogador = new Jogador();
    private Time time = new Time();
    
    public void incluirTime(String sigla, String descricao) {
    	time.setSigla(sigla);
    	time.setDescricao(descricao);
    }
    
    public void incluirJogador(int numero, String nome, String posicao) {
    	jogador.setNumero(numero);
    	jogador.setNome(nome);
    	jogador.setPosicao(posicao);
    	
    	time.adJogador(jogador);
    }
    
    public ArrayList<Jogador> exibirElenco(){
    	return time.getJogadores();
    }
    
    public void exibirElenco() {
    	
    }
}
