package controle;
import java.util.Vector;

public class Programa02 {
	public static void main(String[] args) {
		Vector<String> pessoas = new Vector<String>();
		
		pessoas.add("José");
		pessoas.add("Maria");
		pessoas.add("fernanda");
		pessoas.add("Mariana");
		pessoas.add("Gariel");
		pessoas.add("Tainá");
		
		System.out.println(pessoas);
		System.out.println("Tamanho da coleção: " + pessoas.size());
		System.out.println("Primeira pessoa: " + pessoas.firstElement());
		System.out.println("Última pessoa: " + pessoas.lastElement());
		System.out.println("Terceira pessoa: " + pessoas.get(2));
		System.out.println("Primeira posição de Maria: " + pessoas.indexOf("Maria"));
		System.out.println("Última posição de Maria: " + pessoas.lastIndexOf("Maria"));
		
		if(pessoas.contains("Fernanda"))
			System.out.println("Fernanda está na coleção");
		else
			System.out.println("Fernanda não está na coleção");
		
		if(pessoas.contains("João"))
			System.out.println("João está na coleção");
		else
			System.out.println("João não está na coleção");
		
		pessoas.add(4, "Gabriel");
		System.out.println(pessoas);
		    
	    pessoas.setElementAt("João", 3);
		System.out.println(pessoas);
		
		pessoas.remove("Fernanda");
	}
}
