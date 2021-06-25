//Exemplo  ENQUANTO COM LIMITE- LAÇO DE REPETIÇÃO
programa{
	
	funcao inicio(){

		inteiro idade
		inteiro contador=0
		
		escreva("Digite a sua idade: ")
		leia(idade)
		contador++
		
		enquanto(idade < 18){
			escreva("Você não tem permissão para acessar \n")

			escreva("Digite a sua idade: ")
			leia(idade)
			contador++

			se(contador>=3){
				escreva("Limite de tentativas!")
				pare
			}
		}
		se(contador==1){
			escreva("Parabéns, agora você tem acesso")
		} senao{
			escreva(" Acesso negado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */