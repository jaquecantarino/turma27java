//Faça um programa que entre com três números e coloque em ordem crescente.
package ListaLacoDeDecisao;

import java.util.Scanner;

public class Ex2LacoDeDecisao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
       int num1, num2, num3;
		
		System.out.println("Escolha o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Escolha o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Escolha o terceiro número: ");
		num3 = leia.nextInt();
		if(num1==num2 && num2==num3) {
			System.out.printf("O número %d foi repetido 3 vezes.",num1);
		}else if(num1>num2 && num1>num3 && num2>num3) {
			System.out.printf("A ordem crescente dos números é: %d, %d, %d",num1,num2,num3);
		} else if(num1>num2 && num1>num3 && num3>num2) {
			System.out.printf("A ordem crescente dos números é: %d, %d, %d",num1,num3,num2);
		} else if(num2>num1 && num2>num3 && num3>num1) {
			System.out.printf("A ordem crescente dos números é: %d, %d, %d",num2,num3,num1);
		} else if(num2>num1 && num2>num3 && num1>num3) {
			System.out.printf("A ordem crescente dos números é: %d, %d, %d",num2,num1,num3);
		} else if(num3>num1 && num3>num2 && num2>num1) {
			System.out.printf("A ordem crescente dos números é: %d, %d, %d",num3,num2,num1);
		} else if(num3>num1 && num3>num2 && num1>num2) {
			System.out.printf("A ordem crescente dos números é: %d, %d, %d",num3,num1,num2);
		}


	}

}
