// Carreta Furacão do Ed com Vetor
// Recaba 5 personagens e imprima os personagem na ordem contraria.

programa{
	
	funcao inicio(){
		cadeia personagem[5]
		para(inteiro i = 0; i < 5; i++) {
			escreva("Digite o nome do personagem " + (i+1) + ": ")
			leia(personagem[i])
		}
		para(inteiro i = 4; i >= 0 ; i--) {
			escreva(personagem[i]+"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */