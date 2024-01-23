package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int par = 0;
		int quantiPar = 0;
		
		int[] num = new int[n];
		
		for (int i = 0; i<num.length;i++) {
			System.out.print("Digite um numero: ");
			int numero = sc.nextInt();
			num[i] = numero;
		}
		
		System.out.println("NUMEROS PARES:");
		
		for (int i = 0; i<num.length;i++) {
			if (num[i] % 2 == 0) {
				System.out.printf("%d ", num[i]);
				quantiPar++;
			}
		}
		
		System.out.printf("%nQUANTIDADE DE PARES = %d", quantiPar);
		
		sc.close();
	}

}
