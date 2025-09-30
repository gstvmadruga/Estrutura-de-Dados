package controle;

import java.util.Scanner;

public class Programa01 {
	//Método iterativo
	public static void contarIterativo(int num) {
		for(int i = num; i >= 0; i--)
			System.out.println(i);
		
	}
	//Método recursivo
	
	public static void contarRecursivo(int num) {
		if(num < 0)
			return;
		
		System.out.print(num + " | ");
		contarRecursivo(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		
		System.out.print("\nContagem iterativa: ");
		contarIterativo(num);
		
		System.out.print("\nContagem recursiva: ");
		contarRecursivo(num);
	}

}
