package exAulas11a13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma dos dois números escolhidos foi: " + soma);
		
		scan.close();
	}

}
