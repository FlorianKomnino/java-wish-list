package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> wishList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("Vuoi esprimere un desiderio?");
			System.out.println("1 - si");
			System.out.println("2 - no");
			
			int choice = sc.nextInt();
			
			if (choice<1 || choice>2) {
				System.out.println("Scelta non disponibile. Inserisci una scelta valida");
				continue;
			}
			if(choice == 1) {
				System.out.println("Esprimi il tuo desiderio:");
				sc.nextLine();
				String wish = sc.nextLine();
				wishList.add(wish);
				System.out.println("Fin'ora hai espresso " + wishList.size() + " desideri");
			} else if (choice == 2) {
				break;
			}

		}
		
		System.out.println("Ecco la lista dei tuoi desideri");
		System.out.println(wishList);
		sc.close();
	}
}
