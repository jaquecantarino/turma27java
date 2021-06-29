//2-Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
//e que se encontram no conjunto dos números de 1 até 500

programa{
	
	funcao inicio(){
		inteiro impar3=0, contagem=0

		para(contagem=1;contagem<=500;contagem++){
			
			se (contagem%2==1 e contagem%3==0){
				impar3+=contagem			
			}
		}

		escreva("\nA soma dos números impares e multiplos de 3\nNo intervalo de 1 a 500 é: ",impar3)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 189; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */