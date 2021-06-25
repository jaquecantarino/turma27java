//DESAFIO LAÇO DE REPETIÇÃO: PARA, ENQUANTO, FACA-ENQUANTO
// Receba do usuario numeros inteiros.
// Somente os numeros impares e multiplos de 3 serão somados e terão a composição de média.
// Quando o usuario fornecer 0 encerrar o programa.
// Ao finalizar o progrma mostrar o maior numero impar e multiplo de 3 digitado e a média deles.
programa{
	
	funcao inicio(){
		inteiro num=0, total=0, maior_impar=0
		real contador=0, media_impar=0

		faca{
		escreva("Escreva um número inteiro:")
		leia(num)
		
			se( ((num%2)!=0) e ((num%3)==0)) {
				media_impar = media_impar + num
				contador++
				se(num>maior_impar){
					maior_impar = num
					}
			}			
		} enquanto(num!=0)

		escreva("O programa foi finalizado. Resumo: \n")
		escreva("O maior número impar digitado foi: ",maior_impar)
		escreva("\nA média dos ",contador++," números impares e multiplos de 3 digitados é: ",media_impar)
		

		
		escreva("\nFim do Programa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */