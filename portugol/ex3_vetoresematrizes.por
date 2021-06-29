// Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 
//e N2.
// estou usando x para linha e y para coluna.

programa{

	inclua biblioteca Util

	funcao inicio(){
		inteiro matriz1[4][6]
		inteiro matriz2[4][6]
		inteiro resultado1[4][6]
		inteiro resultado2[4][6]

		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				//aqui a entrada de dados ocorreria atraves do fornecimento do usuario:
			//	escreva("Digite um número para primeira matriz linha ",x," e coluna ",y,":")
			//	leia(matriz1[x][y])
			//	escreva("Digite um número para segunda matriz linha: ",x," e coluna: ",y,":")
			//	leia(matriz2[x][y])
			//aqui usamos a função Util para sortear os valores:
			matriz1[x][y]= Util.sorteia(1,9)
			matriz2[x][y]= Util.sorteia(1,9)
			//escreva(matriz1[x][y],"  \t")
			//escreva(matriz2[x][y],"  \t")			
			}

		}
		//limpa() // limpa os dados para deixar o console mais clean

		//questão a:
		escreva("\nMatriz M1: Soma das Matrizes N1 e N2\n")
		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				resultado1[x][y]= matriz1[x][y]+matriz2[x][y]//está somando as matrizes em cada volta
				escreva(resultado1[x][y],"\t")
				//escreva(" A soma de Matriz1+Matriz2 é: ",resultado1[x][y],"\t")
				
			}escreva("\n")
		}

		//questão b:
		escreva("\nMatriz M2: Diferença das Matrizes N1 e N2\n")
		para(inteiro x=0;x<4;x++){
			para(inteiro y=0;y<6;y++){
				// para a diferença não dar negativa faço a condição do maior para subtrair
				se(matriz1[x][y]>matriz2[x][y]){
				resultado2[x][y]= matriz1[x][y]-matriz2[x][y]
				}
				se(matriz1[x][y]<matriz2[x][y]){
				resultado2[x][y]= matriz2[x][y]-matriz1[x][y]
				}
				//escreva(" A diferença de Matriz1-Matriz2 é: ",resultado1[x][y],"\t")
				escreva(resultado2[x][y],"\t")
			}escreva("\n")
		}				

	escreva("\nFim de programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */