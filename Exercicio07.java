package exAulas11a13;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor do lado do quadrado para saber sua �rea e o dobro dela.");
		
		float lado = scan.nextFloat();
		//double area = lado * lado;
		double area = Math.pow(lado, 2);
		
		System.out.println("A �rea do quadrado �: " + area);
		
		//double dobro = area * area;
		double dobro = Math.pow(area, 2);
		
		System.out.println("O dobro da �rea do quadrado �: " + dobro);
		
		scan.close();
		
		
		
	}
	
	

}
