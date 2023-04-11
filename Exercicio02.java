package exAulas11a13;

import java.util.Scanner;

public class Exercicio02 {

	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		System.out.println("O número digitado foi: " + numero);
		
		scan.close();
		
	}
}
