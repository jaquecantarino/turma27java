//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
//contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior 
//pontua��o.
package ListaVetoresMatrizes;

import java.util.Scanner;

public class Ex2VetoresMatrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int lancamento[] = new int [10];
		int media=0, soma=0, maior=0;
		int jogada=0;
		
		System.out.println("Jogo do Dado - Lembre-se que o dado tem pontua��o de 1 at� 6.");
		
		for(int x=0;x<lancamento.length;x++) {
			System.out.println("Digite qual sua pontua��o no lan�amento: ");
			lancamento[x]=leia.nextInt();
			//jogada = leia.nextInt();
			//if(jogada>6 || jogada<1) {
			//	System.out.println("Valor maior que 6 ou menor que 1, digite um valor valido.");
			//} else {
				soma+=lancamento[x];
			//}

		}
		
		for(int x=0;x<10;x++) {
			if( lancamento[x]>maior){
				maior=lancamento[x];
			}
		}
		
		System.out.println("Sua maior pontua��o foi: "+maior);	
		
		media=soma/10;
		System.out.println("O total de pontua��o foi: "+soma+" E a m�dia �: "+media);

	}

}
