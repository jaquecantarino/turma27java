//Crie um programa que leia um n�mero do teclado at� que encontre um 
//n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
//(DO...WHILE)
package ListaLadoDeRepeticao;

import java.util.Scanner;

public class Ex5LacoDeRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num=0;
		int soma=0;
		
		 do{
			System.out.println("Escreva um n�mero inteiro:");
			num = leia.nextInt();
			soma+=num;
		}while(num!=0);
		
		System.out.println("A soma dos n�meros digitados �: "+soma);
		

	}

}
