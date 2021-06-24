// 3 - Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//3-Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados. 

programa {
	
	inclua biblioteca Matematica --> Math
	
	funcao inicio() {
		inteiro a, b, c, d, quada, quadb, quadc, quadd

		escreva("Escolha um numéro inteiro: ")
		leia(a)
		escreva("Escolha outro numéro inteiro: ")
		leia(b)
		escreva("Escolha mais um número inteiro: ")
		leia(c)
		escreva("Escolha outro numéro inteiro: ")
		leia(d)
		limpa()
		
		quada = Math.potencia (a,2)
		quadb = Math.potencia (b,2)
		quadc = Math.potencia (c,2)
		quadd = Math.potencia (d,2)

		se(quadc >= 1000){
			escreva("O número ",c,"ao quadrado é: ",quadc)
		} senao{
			escreva("O quadrado do número: ",a," é: ",quada,"\n")
			escreva("O quadrado do número: ",b," é: ",quadb,"\n")
			escreva("O quadrado do número: ",c," é: ",quadc,"\n")
			escreva("O quadrado do número: ",d," é: ",quadd,"\n")
		}

		escreva("\n Fim do Programa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1047; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */