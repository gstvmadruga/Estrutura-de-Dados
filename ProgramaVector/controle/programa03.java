package controle;
import java.util.Vector;
import dominio.Animal;

public class Programa03 {

	public static void main(String[] args) {
		Vector<Animal> animais = new Vector<Animal>();
		
		animais.add(new Animal("Betinha", "Canina", "Street Dog"));
		animais.add(new Animal("Pachola", "Canina", "Street Dog"));
		animais.add(new Animal("Mel", "Canina", "Street Dog"));
		animais.add(new Animal("Luana", "Canina", "Street Dog"));
		animais.add(new Animal("Solange", "Canina", "Street Dog"));
	}
}
