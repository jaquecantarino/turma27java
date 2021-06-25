//5-A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de 
//indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável 
//varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas 
//a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo 
//são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser 
//notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição medido 
//e emita a notificação adequada aos diferentes grupos de empresas.
programa{
	
	inclua biblioteca Matematica-->math
	
	funcao inicio(){
		real indicepol

		escreva("Qual índica de poluição coletado? ")
		leia(indicepol)

		se (indicepol >=0.05 e indicepol <= 0.25){
			escreva("O índice está dentro do aceitável! \nNenhuma empresa deve suspender suas atividades.")
		} senao se (indicepol ==0.3){
			escreva(" O índice de poluição está moderamente alto! \nAs empresas do 1º Grupo devem suspender suas atividades")
		} senao se (indicepol ==0.4){
			escreva(" O índice de poluição está alto! \nAs empresas do 1º e 2º Grupo devem suspender suas atividades")
		}  senao se (indicepol ==0.5){
			escreva(" O índice de poluição está altissimo! \nAs empresas do totas as empresas devem suspender suas atividades\n")
		}
	escreva ("\nFim do Programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */