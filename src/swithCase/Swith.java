package swithCase;

import java.util.Scanner;

public class Swith {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //Ask the case
		String caso;
		
		switch (x) { //Switch with value of variable
			case 1: // Case...
				caso = "Caso 1";
				break;
			case 2:
				caso = "Caso 2";
				break;
			case 3:
				caso = "Caso 3 ";
				break;
			default: // Invalid case
				caso = "Caso invalido";
				break; // To break the switch
		}
		
		System.out.println(caso); // Case = selected case
		
		sc.close();

	}

}
