package application;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Quantos números você vai digitar? (máx. 10) ");
			n = sc.nextInt();

			if (n > 10 || n < 1) {
				System.out.println("Número inválido. Informe novamente.");
			}
		} while (n > 10 || n < 1);

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite um número: ");
			int x = sc.nextInt();

			arr[i] = x;
		}

		System.out.println("NÚMEROS NEGATIVOS:");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i]);
			}
		}

		sc.close();
	}

}
