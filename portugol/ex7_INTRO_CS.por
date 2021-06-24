//7-Um sistema de equações lineares do tipo: ax+by/dx+ey
//, pode ser resolvido segundo mostrado abaixo : 
//x=ce-bf/ae-bd  y=af-cd/ae-bd
// Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
programa{
	real a, b, c, d, en, f, x, y
	funcao inicio(){
		escreva("Qual valor de a? ")
		leia(a)
		escreva("Qual valor de b? ")
		leia(b)
		escreva("Qual valor de c? ")
		leia(c)
		escreva("Qual valor de d? ")
		leia(d)
		escreva("Qual valor de e? ")
		leia(en)
		escreva("Qual valor de f? ")
		leia(f)
		x= ((c*en)-(b*f)) / ((a*en)-(b*d))
		y= ((a*f)-(c*d)) / ((a*en)-(b*d))
		escreva ("O valor de x é: ",x," e o valor de y é: ",y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */