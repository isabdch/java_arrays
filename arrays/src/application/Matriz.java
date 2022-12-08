package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m, x;

		n = sc.nextInt();
		m = sc.nextInt();
		System.out.println();

		int arr[][] = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

			System.out.println();
		}

		x = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == x) {
					System.out.println("\nPosition " + i + "," + j + ":");
					
					if (j > 0) {
						System.out.println("Left: " + arr[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + arr[i-1][j]);
					}
					
					if (j < arr[i].length-1) {
						System.out.println("Right: " + arr[i][j+1]);
					}
					
					if (i < arr.length-1) {
						System.out.println("Down: " + arr[i+1][j]);
					}
				}
			}
		}
		

		sc.close();
	}

}
