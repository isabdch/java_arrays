package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		String values = "";

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double arr[] = new double[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite um número: ");
			double x = sc.nextDouble();

			arr[i] = x;
			
			values = values + "  " + arr[i];

			sum += arr[i];
		}
		
		double average = sum / arr.length;

		System.out.println("VALORES =" + values);
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MÉDIA = %.2f%n", average);

		sc.close();
	}

}
