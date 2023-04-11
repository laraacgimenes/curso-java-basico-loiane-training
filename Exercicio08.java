package exAulas11a13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora trabalhada: ");
		double ValorHoras = scan.nextDouble();
		System.out.println("Digite quantas horas você trabalhou esse mês: ");
		float QuantHoras = scan.nextFloat();
		System.out.println("O salário referente a esse mes será: " + ValorHoras * QuantHoras);

		
		scan.close();
		
	}

}
