package controle;

import java.util.Scanner;

public class Programa04 {
	//Método Iterativo
	public static String inverterIterativo(String palavra) {
		String invertida = "";
		
		for(int i = palavra.length()-1 ; i >=0; i--)
			invertida += palavra.charAt(1);
		
		return invertida;
		
	}
	
	//Método Recursiva
		public static String inverterRecursivo(String palavra) {
			if(palavra.length() <= 1) 
				return palavra;
			
			return palavra.charAt(palavra.length()-1)+ 
					inverterRecursivo(palavra.substring(0, palavra.length()-1));
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = input.nextLine();
		
		System.out.println("Invertida Iterativa: " + inverterIterativo(palavra));
		System.out.println("Invertida Recursiva: " + inverterRecursivo(palavra));

	}

}
