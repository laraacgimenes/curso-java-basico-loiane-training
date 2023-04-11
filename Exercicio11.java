package exAulas11a13;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de dois n�meros inteiros: ");
		
		int valorInteiro1 = scan.nextInt();
		int valorInteiro2 = scan.nextInt();
		
		System.out.println("Digite o valor de um n�meros real: ");
		
		double valorReal = scan.nextDouble();
		
		int resultado1 = (valorInteiro1 * 2) * (valorInteiro2 / 2);
		double resultado2 = (valorInteiro1 * 3) + valorReal;
		double resultado3 = Math.pow (resultado1, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo �: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + resultado2);
		System.out.println("O terceiro elevado ao cubo: " + resultado3);
		
		
		
//		OUTRA MANEIRA DE FAZER SERIA FAZER AS OPERA��ES DIRETO NAS RESPOSTAS  
				
//		System.out.println("O produto do dobro do primeiro com metade do segundo �: " + ((valorInteiro1 *2) + (valorInteiro2 / 2)));
//		System.out.println("A soma do triplo do primeiro com o terceiro �: " + ((valorInteiro1 *3) + valorReal));
//		System.out.println("O terceiro elevado ao cubo: " + valorReal * valorReal * valorReal);


		scan.close();
	}
}
