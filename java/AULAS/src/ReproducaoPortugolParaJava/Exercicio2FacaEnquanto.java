// 2- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os 
//n�meros  de 1 at� ele. //Ex.: o usu�rio entra 7, o programa vai mostrar 28, 
//pois  1+2+3+4+5+6+7=28.

package ReproducaoPortugolParaJava;

import java.util.Scanner;

public class Exercicio2FacaEnquanto {
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int num, soma=0, contador=0;
	String Op;
	
	System.out.println("Digite um n�mero inteiro: ");
	num = leia.nextInt();
	
		if(num<=0) {
			System.out.println("N�mero inv�lido! Escreva um n�mero inteiro e positivo.");
			System.out.println("Digite um n�mero inteiro: ");
			num = leia.nextInt();
		}
		do {
			
			
			
			
			
			
		}while(contador<num);
	
	}
}
