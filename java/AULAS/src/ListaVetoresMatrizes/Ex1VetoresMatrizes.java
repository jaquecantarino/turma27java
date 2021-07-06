//Faça um programa que crie um vetor por leitura com 5 valores de 
//pontuação de uma atividade e o escreva em seguida. Encontre após a 
//maior pontuação e a apresente. 
package ListaVetoresMatrizes;

import java.util.Scanner;

public class Ex1VetoresMatrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[5];
		int maior=0;
		
		for(int x=0;x<5;x++) {
			System.out.println("Digite um número inteiro:");
			valores[x]=leia.nextInt();
		}
		
		for(int x=0;x<5;x++) {
			System.out.printf("Número: %d\n",valores[x]);
			
			if(valores[x]>maior) {
				maior=valores[x];
			}
		}

		System.out.println("O maior número digitado foi: "+maior);

		

	}

}
