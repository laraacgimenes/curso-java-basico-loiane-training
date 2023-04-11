package exAulas11a13;

import java.util.Scanner;

public class Exercicio13 {
	
	public static void  main(String[]args) {
		
		Scanner scan = new Scanner(System.in);		
		
		String feminino = "f || F"; 
		String masculino = "m || M"; 
				
		System.out.println("Digite sua altura: ");
		float altura = scan.nextFloat();		
				
		double pesoIdealHomens = (72.7 * altura) - 58;
		double pesoIdealMulheres = (62.1 * altura) - 44.7;
		
		System.out.println("Mulher: peso ideal = " + pesoIdealMulheres);
		System.out.println("Homens: peso ideal = " + pesoIdealHomens);
		
		
		System.out.println("Digite sua peso: ");
		float pesoFeminino = scan.nextFloat();
		
		


		
		scan.close();
		
	}

}
