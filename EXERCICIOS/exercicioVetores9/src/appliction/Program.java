package appliction;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;


public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoa voce vai digitar? ");
		
		int n = sc.nextInt();
		int maior = 0;
		String nomeMaior = "";
		
		Pessoa[] p = new Pessoa[n];
		
		for (int i = 0; i< p.length;i++) {
			System.out.printf("Dados da %d pessoa%n", i + 1);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			p[i] = new Pessoa(nome, idade);
		}
		
		maior = p[0].getIdade();
		
		for(int i = 0; i< p.length;i++) {
			if (p[i].getIdade() > maior) {
				maior = p[i].getIdade();
				nomeMaior = p[i].getNome();				
			}
		}
		
		System.out.printf("PESSO MAIS VELHA: %s", nomeMaior);
		
		
	}

}
