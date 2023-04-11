package exAulas11a13;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void  main(String[]args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Digite M ou m para masculino e F ou f para sexo feminino: ");
		String sexo = scan.next(); 
		 
				
		System.out.println("Digite sua altura: ");
		float altura = scan.nextFloat();
		
		if (sexo.equalsIgnoreCase("m")) {
			double pesoIdealHomens = (72.7 * altura) - 58;
			System.out.println("Homens: peso ideal = " + pesoIdealHomens);
		} else if (sexo.equalsIgnoreCase("f")) {
			double pesoIdealMulheres = (62.1 * altura) - 44.7;
			System.out.println("Mulher: peso ideal = " + pesoIdealMulheres);
		}
						
	
		
		
		scan.close();
		
	}

}
