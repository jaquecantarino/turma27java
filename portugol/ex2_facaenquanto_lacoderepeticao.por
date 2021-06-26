// 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele.
//Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

programa{
	
	funcao inicio(){
		inteiro num=0, soma=0, contador=0
		
		escreva("Digite um número inteiro de 0 até 9: ")
		leia(num)
		
		faca{
			contador++
			escreva(contador, " +")
			soma= soma+contador

		}enquanto(contador<num)
		escreva("= ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */