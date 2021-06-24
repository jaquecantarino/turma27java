// Desafio 2: Pedir um numero inteiro para o usario
// Se for par exibir que é par, senão exibir que é impar.
programa{
	
	funcao inicio(){
		inteiro num, par, impar, resultado

		escreva("Digite um numero inteiro: ")
		leia(num)

		se((num%2)==0){
			escreva("O número ",num," é par!")
		} senao {
			escreva ("O número ",num," é ímpar!")
		}
		escreva(" \n Fim do programa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */