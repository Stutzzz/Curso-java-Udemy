package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados: ");
		
		int n = sc.nextInt();
		
		Alunos[] a = new Alunos[n];
		
		
		for(int i = 0; i<a.length;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do alunos%n", i +1);
			String nome = sc.next();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			a[i] = new Alunos(nome, nota1, nota2);
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		for(int i = 0; i<a.length;i++) {
			double media = (a[i].getNota1() + a[i].getNota2()) / 2;
			
			if (media >= 6) {
				System.out.println(a[i].getNome());
				
			}
		}
		
		
		
		
		sc.close();
	}

}
