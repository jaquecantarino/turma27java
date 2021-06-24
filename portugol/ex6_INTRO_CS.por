//Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
//P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
//d=raizquadrada(x2 - x1)²+(y2-y1)²
programa{
	inclua biblioteca Matematica-->Math
	
	funcao inicio(){
		real x1, y1, x2, y2, d, d1

		escreva("Qual ponto X1: ")
		leia(x1)
		escreva("Qual ponto X2: ")
		leia(x2)
		escreva("Qual ponto Y1: ")
		leia(y1)
		escreva("Qual ponto Y2: ")
		leia(y2)

		d= Math.raiz ((Math.potencia ((x2 - x1),2)) + (Math.potencia ((y2 - y1),2)),2)
		escreva ("A distancia de D é igual a: ",Math.arredondar(d,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */