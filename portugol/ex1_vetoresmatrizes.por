//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
//e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
programa{
	
	funcao inicio(){
		inteiro pontuacao[5]
		inteiro maior=0

		para(inteiro x=0;x<5;x++){
			escreva("Qual a pontuação? ")
			leia(pontuacao[x])			
		}
		limpa()
		
		para(inteiro x=0;x<5;x++){
			escreva(pontuacao[x],", ")
		

			se(pontuacao[x]>maior){
				maior=pontuacao[x]
			}
		
		}

		escreva("\nSua maior pontuação é: ",maior)
		
	escreva("\nFim do programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */