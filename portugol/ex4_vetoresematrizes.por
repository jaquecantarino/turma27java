//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
//exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal 
//principal.
// estou usando x para linha e y para coluna.
programa{
	
	funcao inicio(){
		inteiro matriz1[3][3]
		inteiro diagonal=0

		para(inteiro x=0;x<3;x++){
			para(inteiro y=0;y<3;y++){
			//aqui a entrada de dados ocorreria atraves do fornecimento do usuario:
				escreva("Digite um número para primeira matriz linha ",x," e coluna ",y,":")
				leia(matriz1[x][y])

				se(x==y){
					diagonal = diagonal+matriz1[x][y] //recebe a soma da diagonal.
				}
			}
		}
		limpa()
		escreva("A soma da diagonal princial é: ",diagonal)

	escreva("\nFim do Programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 769; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */