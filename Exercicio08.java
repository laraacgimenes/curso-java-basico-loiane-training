package exAulas11a13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto voc� ganha por hora trabalhada: ");
		double ValorHoras = scan.nextDouble();
		System.out.println("Digite quantas horas voc� trabalhou esse m�s: ");
		float QuantHoras = scan.nextFloat();
		System.out.println("O sal�rio referente a esse mes ser�: " + ValorHoras * QuantHoras);

		
		scan.close();
		
	}

}
