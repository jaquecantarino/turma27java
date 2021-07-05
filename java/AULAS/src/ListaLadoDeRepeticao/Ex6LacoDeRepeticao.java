//Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 
//0(zero).(DO...WHILE)
package ListaLadoDeRepeticao;

import java.util.Scanner;

public class Ex6LacoDeRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num=0, contadornum=0, contador=0;
		double conta=0, multi=0;
		
		do {
			contadornum++;
			System.out.println("Para sair insira 0 ou Digite um número inteiro para calcular: ");
			num = leia.nextInt();
				
				if(num%3==0) {
					multi+=num;
					contador++;
				}
			
		}while(num!=0);
		
		conta=multi/3;
		
		System.out.printf("Dos %d números digitados %d eram multiplos de 3.\nE a média de sua soma é: %.1f",contadornum,contador,conta);

	}

}
