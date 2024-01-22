package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int n = sc.nextInt();
		double soma, media;
		
		double[] vetor = new double[n];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		
		soma = 0;
		for (int i = 0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.print("VALORES: ");
		for (int i = 0; i<vetor.length;i++) {
			System.out.printf("%.1f ",vetor[i]);
		}
		
		System.out.printf("%nSOMA = %.2f", soma);
		System.out.printf("%nMEDIA = %.2f%n", media);
		
		
		
		
		sc.close();
	}

}
