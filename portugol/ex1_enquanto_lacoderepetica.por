//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final 
//o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
//valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar 
//quando o usuário fornecer um valor negativo.

programa{
	inclua biblioteca Matematica-->mat

	funcao inicio(){
		inteiro num=0, soma=0, contador=0
		real media=0.0, total=0.0

		escreva("Digite um número positivo para continuar\nOu um número negativo para encerrar.\n:")
		leia(num)

		enquanto(num>0){
			soma += num
			contador++
						
			escreva("Digite um número positivo para continuar\nOu um número negativo para encerrar.\n:")
			leia(num)
					
			limpa()

		media = soma / contador

		escreva("\nTotal dos números: ",soma)
		escreva("\nA quantidade de números lidos são :",contador)
		escreva("\nA médias dos números lidas é: ",mat.arredondar(media,2))
		}

		escreva("\nFim do programa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */