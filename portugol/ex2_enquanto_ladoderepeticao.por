//2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
//(imprimindo o novo valor) até que ele seja maior do que 100.
// Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
programa
	
	funcao inicio()
		inteiro num, mulpli=0

		escreva("Digite um número: ")
		leia(num)

		enquanto (num <=100 e mulpli <=100){
			mulpli = num*3
			num=mulpli
			escreva(mulpli,"\n")
		} 

	escreva("\nFim do programa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */