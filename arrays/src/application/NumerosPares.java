package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String numerosPares= "";
		int somaPares = 0;

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite um número: ");
			int x = sc.nextInt();
			
			arr[i] = x;
			
			if (arr[i] % 2 == 0) {
				somaPares++;
				numerosPares = numerosPares + arr[i] + "  ";
			}			
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		System.out.println(numerosPares);
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + somaPares);
		
		sc.close();
	}

}
