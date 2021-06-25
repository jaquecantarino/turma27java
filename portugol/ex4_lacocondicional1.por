//4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se 
//este número é par ou ímpar, e se é positivo ou negativo.
programa{
	inclua biblioteca Matematica-->math
	
	funcao inicio(){
		inteiro num
	
		escreva("Digite um número inteiro: ")
		leia(num)
		limpa()

		se (num==0){
			escreva("O número ",num," é neutro")
		}
		senao se((num%2)==0){
			escreva("O número ",num," é par")			
		} senao{
			escreva("O número ",num," é ímpar")
		}
		
		se(num>0){
			escreva(" e positivo!")
		} senao se (num<0){
			escreva(" e negativo!")
		} senao {
			escreva(" portanto não é nem negativo nem positivo\n")
		}

	escreva ("\nFim do programa!")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */