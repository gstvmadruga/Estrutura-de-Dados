package controle;

import java.util.Scanner;

public class Programa01 {
	
	public static int pesquisar(int[] numeros, int num) {
		
		for(int i = 0; i < numeros.length; i++)
			if(numeros[i] == num)
				return i;
		
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 int[] numeros = {3,17,25,38,68,79,94,1,5,23,26,42,70,83};
		 
		 System.out.println("Digite um numero para pesquisa: ");
		 int num = input.nextInt();
		 
		 
		 int posicao = pesquisar(numeros, num);
		 
		 if(posicao != -1)
			 System.out.println("Elemento encontrado na posição: " + posicao);
		 else
			 System.out.println("Elemento não encontrado na coleção ");
			 
	}

}
