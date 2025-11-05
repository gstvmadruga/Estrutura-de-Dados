package controle;

public class Programa01 {
	public static int[] ordenar(int[] numeros) {
		for(int i = 0; i < numeros.length; i++) {
			int iMenor = i;
		
		for(int j = i + 1; j < numeros.length; j++)
			if(numeros[j] < numeros[iMenor])
				iMenor = j;
		
		int temp = numeros[i];
		numeros[i] = numeros[iMenor];
		numeros[iMenor] = temp;
	}
		return numeros;
}

	public static void main(String[] args) {
		int[] numeros = {3,17,26,42,70,83,1,5,23,38,68,79,94};
		
		System.out.println("Antes da ordenação: ");
		for(int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i] + " | ");
		
		numeros = ordenar(numeros);
		
		System.out.println("\nDepois da ordenação: ");
		for (int i = 0; i < numeros.length; i++)
			System.out.print(numeros[i]+ " | ");
	}
}
