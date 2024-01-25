package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
	
		int n = sc.nextInt();
		
		Pessoa[] p = new Pessoa[10];
		
		for (int i = 0;i<n;i++) {
			System.out.printf("Rent #%d%n", i + 1);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			p[room] = new Pessoa(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0;i<p.length;i++) {
			if (p[i] != null) {
				System.out.printf("%d: ",i);
				System.out.println(p[i]);
			}
		}
		
		sc.close();
		
	}

}
