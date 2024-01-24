package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitados? ");
		
		int n = sc.nextInt();
		double maior, menor, soma, media;
		int contM, contF;
		
		
		Pessoas[] p = new Pessoas[n];
		
		for(int i = 0; i < p.length; i++) {
			System.out.printf("altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("altura da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			genero = Character.toUpperCase(genero);
			
			p[i] = new Pessoas(altura, genero);
		}
		
		
		maior = p[0].getAltura();
		menor = p[0].getAltura();
		
		for(int i = 0; i < p.length; i++) {
			if(p[i].getAltura() > maior) {
				maior = p[i].getAltura();
			}else if(p[i].getAltura() < menor) {
				menor = p[i].getAltura();
			}			
		}
		
		soma = 0;
		contM = 0;
		contF = 0;
		
		for (int i = 0; i < p.length; i++) {
			if (p[i].getGenero() == 'F') {
				contF++;
				soma += p[i].getAltura(); 
			}else {
				contM++;
			}
			
		}
		
		media = soma / contF;
		
		System.out.printf("MENOR ALTURA: %.2f%n", menor);
		System.out.printf("MAIOR ALTURA: %.2f%n", maior);
		System.out.printf("MEDIA DAS ALTURAS DA MULHERES: %.2f%n", media);
		System.out.printf("NUMERO DE HOMENS: %d", contM);
		
		
		
		
		sc.close();
	}

}
