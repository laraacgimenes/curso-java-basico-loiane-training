package exAulas11a13;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma medida em metros para converte-la para cent�metro: ");
	
		float numero = scan.nextFloat();
		float nCentimetro = numero *100;
		
		System.out.println("O n�mero digitado vale :" + nCentimetro + " cm" );
		
		scan.close();
	}

}
