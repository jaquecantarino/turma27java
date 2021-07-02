//1-Faça um programa que receba três inteiros e diga qual deles é o maior.
package ListaLacoDeDecisao;

import java.util.Scanner;

public class Ex1LacoDeDecisao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int num1, num2, num3;
		
		System.out.println("Escolha o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Escolha o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Escolha o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.printf("O maior número digitado é: %d, que foi o primeiro número.",num1);
		} else if(num2>num1 && num2>num3) {
			System.out.printf("O maior número digitado é: %d, que foi o segundo número.",num2);
		} else {
			System.out.printf("O maior número digitado é: %d, que foi o terceiro número.",num3);
		}
	}

}
