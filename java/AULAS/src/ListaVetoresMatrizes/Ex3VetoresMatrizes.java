//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma 
//posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
//de mesma posição das matrizes N1 e N2.
package ListaVetoresMatrizes;

import java.util.Scanner;
import java.util.Random;

public class Ex3VetoresMatrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		int matriz1 [][]= new int [4][6];
		int matriz2 [][]= new int [4][6];
		int resultado1 [][]= new int [4][6];
		int resultado2 [][]= new int [4][6];
		Random random = new Random();
		
		for (int x=0;x<4;x++){
			for (int y=0;y<6;y++){
				int linha, coluna;
				linha = random.nextInt(4);
				coluna = random.nextInt(6);
				
				matriz1[x][y]=matriz1[linha][coluna];
				matriz2[x][y]=matriz1[linha][coluna];
				//sorteador random está zerado, estudar o porquê.
			}
		}
		//questão a:
		System.out.println("\nMatriz M1: Soma das Matrizes N1 e N2\n");
		
		for(int x=0;x<4;x++){
			for(int y=0;y<6;y++){
				resultado1[x][y]= matriz1[x][y]+matriz2[x][y];//está somando as matrizes em cada volta
				System.out.println(resultado1[x][y]+"\t");
				//escreva(" A soma de Matriz1+Matriz2 é: ",resultado1[x][y],"\t")
						
					}
		}
		//questão b:
		System.out.println("\nMatriz M2: Diferença das Matrizes N1 e N2\n");
			for(int x=0;x<4;x++){
				for(int y=0;y<6;y++){
					// para a diferença não dar negativa faço a condição do maior para subtrair
					if(matriz1[x][y]>matriz2[x][y]){
					resultado2[x][y]= matriz1[x][y]-matriz2[x][y];
					}
					if(matriz1[x][y]<matriz2[x][y]){
					resultado2[x][y]= matriz2[x][y]-matriz1[x][y];
					}
					//escreva(" A diferença de Matriz1-Matriz2 é: ",resultado1[x][y],"\t")
					System.out.println(resultado2[x][y]+"\t");
					}
				}				
	}

}
