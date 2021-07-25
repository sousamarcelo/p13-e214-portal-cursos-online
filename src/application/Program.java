package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entity.Studants;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Studants> set = new HashSet<Studants>();
		
		System.out.print("Teache name: ");
		String teacheName = sc.nextLine();		
		
		System.out.print("How many students for course A? " );
		Integer quantityStudants = sc.nextInt();		
		for(int i = 1; i <= quantityStudants; i++) {	
			int studantCode = sc.nextInt();
			set.add(new Studants(studantCode));
		}
		
		System.out.print("How many students for course B? " );
		Integer quantityStudantsB = sc.nextInt();		
		for(int i = 1; i <= quantityStudantsB; i++) {	
			int studantCode = sc.nextInt();
			set.add(new Studants(studantCode));
		}
		
		System.out.print("How many students for course C? " );
		Integer quantityStudantsC = sc.nextInt();		
		for(int i = 1; i <= quantityStudantsC; i++) {	
			int studantCode = sc.nextInt();
			set.add(new Studants(studantCode));
		}
		
		System.out.println("Teacher: " + teacheName);
		System.out.println("Total students: " + set.size());
		
		
		sc.close();
	}

}
