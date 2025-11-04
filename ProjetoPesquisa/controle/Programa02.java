package controle;

import java.util.Scanner;

public class Programa02 {
	
	public static int pesquisar(int[] numeros, int num) {
		
		int ini = 0;
		int fim = numeros.length - 1;
		
		while(ini <= fim) {
			int meio = (ini+fim)/2;
			
			if(numeros[meio] == num)
				return meio;
				
			else if(numeros[meio] < num)
				ini = meio +1;
			
			else if(numeros[meio] > num)
				fim = meio -1;
			
		}
			
		return -1;
	}


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 int[] numeros = {1,3,5,17,23,25,26,38,42,68,70,79,83,94};
		 
		 System.out.println("Digite um numero para pesquisa: ");
		 int num = input.nextInt();
		 
		 
		 int posicao = pesquisar(numeros, num);
		 
		 if(posicao != -1)
			 System.out.println("Elemento encontrado na posição: " + posicao);
		 else
			 System.out.println("Elemento não encontrado na coleção ");

	}

}

