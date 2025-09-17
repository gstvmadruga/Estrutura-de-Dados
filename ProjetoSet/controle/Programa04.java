package controle;

import java.util.TreeSet;

public class Programa04 {

	public static void main(String[] args) {
		TreeSet<String> nomes = new TreeSet<String>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Dalira");
		nomes.add("Ralf");
		nomes.add("Gerson");
		
		System.out.println(nomes);
		
		nomes.add("João");
		nomes.add("Mariana");
		nomes.add("Gabriel");
		nomes.add("Fernanda");
		nomes.add("Tainá");
		
		System.out.println(nomes);

	}

}
