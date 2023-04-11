package exAulas11a13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quatro notas bimestrais para que seja calculada sua média ");
		
		float nota01 = scan.nextFloat();
		float nota02 = scan.nextFloat();
		float nota03 = scan.nextFloat();
		float nota04 = scan.nextFloat();
		float media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.println("A média bimestral é: " + media);
	
		scan.close();

		
		
		
		
	}

}
