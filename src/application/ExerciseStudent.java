package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ExerciseStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Student[] vect = new Student[10];
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.printf("Rent#%d\n", i+1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room ");
			int room = sc.nextInt();
			vect[room] = new Student(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
