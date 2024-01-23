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
		int nPares = 0;

		int[] vetor = new int[n];
		
		for (int i = 0;i<vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		soma = 0;
		
		for (int i = 0;i<vetor.length;i++) {
			if (vetor[i] %2 == 0) {
				soma += vetor[i]; 
				nPares++;
			}
		}
		
		if(nPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
			
		}else {
			media = soma / nPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		
		
		
		
		
		
		sc.close();
	}

}
