package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entity.Studants;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> c = new HashSet<Integer>();
		
		System.out.print("Teache name: ");
		String teacheName = sc.nextLine();	
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		
		Set<Integer> total = new HashSet<Integer>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total studants: " + total.size());
		

		
		
		sc.close();
	}

}
