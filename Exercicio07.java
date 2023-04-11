package exAulas11a13;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor do lado do quadrado para saber sua área e o dobro dela.");
		
		float lado = scan.nextFloat();
		//double area = lado * lado;
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é: " + area);
		
		//double dobro = area * area;
		double dobro = Math.pow(area, 2);
		
		System.out.println("O dobro da área do quadrado é: " + dobro);
		
		scan.close();
		
		
		
	}
	
	

}
