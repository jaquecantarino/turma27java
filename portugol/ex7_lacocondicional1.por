//7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
//calculo de area do triangulo = (base * altura) /2
programa{
	inclua biblioteca Matematica
	
	funcao inicio(){
		inteiro base, altura, area

		escreva("Qual valor da base do triangulo?")
		leia(base)
		escreva("Qual valor da altura do triangulo?")
		leia(altura)

		se(base>0 e altura>0 e altura>=base){
			area = (base*altura)/2
			escreva("A area do triangulo é: ",area)
		} senao {
			escreva("Os valores informados não são válidos.\nPor favor revise as informações.")
		}

	escreva("\nFim do programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */