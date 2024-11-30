package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exercise03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serão digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		
		for(int i =0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade ");
			int idade = sc.nextInt();
			System.out.print("Altura ");
			double altura = sc.nextDouble();
			vect[i] = new Person(name, idade, altura);
		}
		
		double alturaTotal = 0.0;
		for (int i=0; i<vect.length; i++) {
			alturaTotal += vect[i].getAltura();
			
		}
		
		double alturaMedia = alturaTotal / n;
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		int menores = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				menores += 1;
			 }
		}
		
		double percentualMenores = 0.0;
		percentualMenores = ((double)menores/ n) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for(int i=0; i<vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.printf("%s\n", vect[i].getName());
			}
			
		}
		
		sc.close();

	}

}
