package exAulas11a13;

import java.util.Scanner;

public class Exercicio15 {

	public static void  main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto voc� ganha por hora trabalhada: ");
		double valorHoras = scan.nextDouble();
		System.out.println("Digite quantas horas voc� trabalhou esse m�s: ");
		double quantHoras = scan.nextDouble();
		
		double salarioBruto = valorHoras * quantHoras;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato +ir;
		double salarioLiquido = salarioBruto - totalDescontos;


		System.out.println("O sal�rio bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
		

		
		scan.close();
		
	}

}
