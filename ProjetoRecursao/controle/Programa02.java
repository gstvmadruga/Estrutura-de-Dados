package controle;

import java.util.Scanner;

public class Programa02 {
	
	//Método Iterativo
	public static int somarIterativo(int num) {
		int soma = 0;
		
		for(int i = 1; i<= num; i++)
			soma+=i;
				
		return soma;		
	}
	
	//Método Recursivo
	public static int somarRecursivo(int num) {
		if(num <= 0)
			return 0;
		
		return num + somarRecursivo(num - 1);
	}
			
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		
		System.out.println("\nSoma Iterativa: " + somarIterativo(num));
		System.out.println("\nSoma Recursiva: " + somarRecursivo(num));

	}

}
