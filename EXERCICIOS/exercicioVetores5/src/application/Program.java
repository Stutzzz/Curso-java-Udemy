package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.Position;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int n = sc.nextInt();
		int posmaior = 0;
		double maior = 0;
		
		double[] vetor = new double[n];
		
		for (int i = 0; i<vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		
		for (int i = 0; i<vetor.length;i++) {
			if (vetor[i] > maior ) {
				maior = vetor[i];
				posmaior = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posmaior);
		
		
		
		sc.close();
	}

}
