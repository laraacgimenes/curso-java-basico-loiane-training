package exAulas11a13;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Digite o valor da temperatura em Celsius para converte-lo para Farenheit");
	
		float celsius = scan.nextFloat();
		
		System.out.println("O valor em graus Celsius é: " + ((celsius * 1.8) + 32) + "F");

		
		
		scan.close();
	}

}
