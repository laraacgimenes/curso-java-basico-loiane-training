package exAulas11a13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite o valor do raio do circulo para saber sua área.");
		
		float raio = scan.nextFloat();
		//double area = 3.14 * (raio * raio);
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do císulo é: " + area);
		
		scan.close();
	}

}
