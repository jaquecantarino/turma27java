//4-Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a 
//seguinte expressão:
//D=R+S/2, onde R=(A+B)² S=(B+C)²
programa{
	inclua biblioteca Matematica-->Math
	
	funcao inicio(){
		real a, b, c, d, r, s

		escreva("Digite um número inteiro: ")
		leia(a)
		escreva("Digite um número inteiro: ")
		leia(b)
		escreva("Digite um número inteiro: ")
		leia(c)

		//r=(a+b)*(a+b)
		r= Matematica.potencia ((a+b),2)
		//s=(b+c)*(b+c)
		s= Math.potencia ((b+c),2)
		

		d= (r + s) / 2
		escreva (" O valor é: ",d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */