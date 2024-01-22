package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double media, soma, menor, porc;

		Product[] vetor = new Product[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);

			System.out.print("NOME : ");
			String nome = sc.next();

			System.out.print("IDADE : ");
			int idade = sc.nextInt();

			System.out.print("ALTURA : ");
			double altura = sc.nextDouble();

			vetor[i] = new Product(nome, idade, altura);

		}

		soma = 0;
		menor = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getAltura();
			if (vetor[i].getIdade() < 16) {
				menor++;
			}
		}

		porc = 100 * (menor / vetor.length);
		media = soma / vetor.length;

		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porc);

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}

		}

		sc.close();

	}

}
