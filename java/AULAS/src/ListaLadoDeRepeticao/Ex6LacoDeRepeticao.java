//Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 
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
			System.out.println("Para sair insira 0 ou Digite um n�mero inteiro para calcular: ");
			num = leia.nextInt();
				
				if(num%3==0) {
					multi+=num;
					contador++;
				}
			
		}while(num!=0);
		
		conta=multi/3;
		
		System.out.printf("Dos %d n�meros digitados %d eram multiplos de 3.\nE a m�dia de sua soma �: %.1f",contadornum,contador,conta);

	}

}
