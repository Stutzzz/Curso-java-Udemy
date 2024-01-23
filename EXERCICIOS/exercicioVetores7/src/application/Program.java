package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai o vetor? ");
		
		int n= sc.nextInt();
		double soma, media;
		
		double[] vetor = new double[n];
		
		for (int i = 0;i<vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		
		for (int i = 0;i<vetor.length;i++) {
			soma += vetor[i];
		}
		media = soma / vetor.length;
		
		System.out.printf("MEDIA VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		
		for (int i = 0;i<vetor.length;i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}

}
