//1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
package ListaLacoDeDecisao;

import java.util.Scanner;

public class Ex1LacoDeDecisao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int num1, num2, num3;
		
		System.out.println("Escolha o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Escolha o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Escolha o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.printf("O maior n�mero digitado �: %d, que foi o primeiro n�mero.",num1);
		} else if(num2>num1 && num2>num3) {
			System.out.printf("O maior n�mero digitado �: %d, que foi o segundo n�mero.",num2);
		} else {
			System.out.printf("O maior n�mero digitado �: %d, que foi o terceiro n�mero.",num3);
		}
	}

}
