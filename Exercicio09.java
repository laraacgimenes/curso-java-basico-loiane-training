package exAulas11a13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Farenheit para converte-lo para Celsius");
		
		float farenheit = scan.nextFloat();
		
		System.out.println("O valor em graus Celsius é: " + (5 * (farenheit-32) / 9) + " C");
		
		
		scan.close();
	}

}
