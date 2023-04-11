package exAulas11a13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o peso do peixe pescado: ");
		
		float pesoPeixe = scan.nextFloat();
		
		System.out.println("Peso limite de 50kg excedido: " + (pesoPeixe > 50));
		System.out.println("Peso menor ou igual ao limite de 50kg: " + (pesoPeixe <= 50));

		//boolean pesoEmExecesso = (pesoPeixe > 50);
		//boolean pesoLimite = (pesoPeixe <= 50);
		
		
		scan.close();
			
	}

}
