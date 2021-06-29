//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um 
//vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética 
//dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.

programa{
	
	funcao inicio(){
		inteiro lancamento[10]
		inteiro media=0, maior=0, soma=0

		para(inteiro x=0; x<10; x++) {
			escreva("Digite qual sua pontuação no lançamento ",(x+1),": ")
			leia(lancamento[x])
			soma += lancamento[x]
		}
		limpa()

		para(inteiro x=0; x<10; x++){
			se(lancamento[x]>maior){
				maior = lancamento[x]
			}

		}

		escreva("\nSua maior pontuação foi ",maior," pontos.")	
			
		media = soma/10
		escreva("\nSua média é: ",media)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */