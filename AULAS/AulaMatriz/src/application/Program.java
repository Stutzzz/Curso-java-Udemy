package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int cont = 0;
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i <n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < n;i++) {
			for (int j = 0; j < n;j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Negative numbers = " + cont);
		
		
		
		
		sc.close();
	}

}
