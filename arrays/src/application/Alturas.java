package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double somaAltura = 0;
		int pessoasMenos16 = 0;

		System.out.print("Quantas pessoas são digitadas? ");
		int n = sc.nextInt();

		Pessoa arr[] = new Pessoa[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");

			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			somaAltura += altura;

			if (idade < 16) {
				pessoasMenos16++;
			}

			arr[i] = new Pessoa(nome, idade, altura);
		}

		double alturaMedia = somaAltura / arr.length;
		double percentualMenores16 = ((double) pessoasMenos16 / arr.length) * 100.0;

		System.out.printf("Altura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores16);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getAge() < 16) {
				System.out.println(arr[i].getName());
			}
		}

		sc.close();
	}

}
