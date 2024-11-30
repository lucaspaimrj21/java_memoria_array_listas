package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i =0; i<vect.length; i++) {
			System.out.print("Digite um número ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Valores:");
		for(int i=0; i<vect.length; i++) {
				System.out.printf(vect[i] + " ");
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.print("\n");
		System.out.printf("SOMA = " + sum);
		System.out.print("\n");
		System.out.printf("MEDIA = " + avg);
		
		sc.close();

	}

}
