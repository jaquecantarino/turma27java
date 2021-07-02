//Faça um programa em que permita a entrada de um número qualquer e 
//exiba se este número é par ou ímpar. Se for par exiba também a 
//raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
package ListaLacoDeDecisao;

import java.util.Scanner;

public class ExLacoDeDecisao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double num, raiznum, pownum;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextDouble();
		
		if(num<0) {
			System.out.println("Número negativo.");
		} else if(num%2==0) {
			raiznum = Math.sqrt(num);
			System.out.printf("A raíz quadrada de %.1f é: %.2f",num,raiznum);
		} else {
			pownum = Math.pow(num, 2);
			System.out.printf("O número %.1f elevado ao quadrado é: %.2f",num,pownum);
		}

	}

}
