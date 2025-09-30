package controle;

import java.util.Scanner;

public class Programa03 {
	
	//metodo iterativo
	public static int fatorarIterativo(int num) {
		int fatorial = 1;
		
		for(int i = num; i>= 1; i--)
			fatorial *= i;
		
		return fatorial;
	}
	
	//Método Recursivo
	public static int fatorarRecursivo(int num) {
	    if (num <= 0)
	        return 1;
	    
	    return num * fatorarRecursivo(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		
		System.out.println("Fatorial iterativo: " + fatorarIterativo(num));
		System.out.println("Fatorial recursivo: " + fatorarRecursivo(num));

	}

}
