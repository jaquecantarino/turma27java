// 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os 
//números  de 1 até ele. //Ex.: o usuário entra 7, o programa vai mostrar 28, 
//pois  1+2+3+4+5+6+7=28.

package ReproducaoPortugolParaJava;

import java.util.Scanner;

public class Exercicio2FacaEnquanto {
	public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int num, soma=0, contador=0;
	String Op;
	
	System.out.println("Digite um número inteiro: ");
	num = leia.nextInt();
	
		if(num<=0) {
			System.out.println("Número inválido! Escreva um número inteiro e positivo.");
			System.out.println("Digite um número inteiro: ");
			num = leia.nextInt();
		}
		do {
			
			
			
			
			
			
		}while(contador<num);
	
	}
}
