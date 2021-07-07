//Crie um programa que receba valores do usuário para preencher 
//uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a 
//soma dos valores da primeira diagonal, ou seja, diagonal principal.
package ListaVetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex4VetoresMatrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int valores[][] = new int [3][3];
		int soma=0, diagonal=0;
		
		for(int linha=0;linha<3;linha++){
			for(int coluna=0;coluna<3;coluna++){
				System.out.printf("Digite um número para primeira matriz linha"+linha+" e coluna "+coluna+": ");
				valores[linha][coluna] = leia.nextInt();
				
				if(linha==coluna) {
					diagonal = diagonal+valores[linha][coluna];
				}
			}
		}
		
		System.out.println("A soma da diagonal principal é: "+diagonal);
	}

}
