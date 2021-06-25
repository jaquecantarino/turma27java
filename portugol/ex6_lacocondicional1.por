//6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos
programa{
	inclua biblioteca Matematica
	
	funcao inicio(){
		inteiro idade

		escreva("Qual a idade do aluno? ")
		leia(idade)

		se (idade >=5 e idade<=7){
			escreva("O aluno deve ser matriculado na turma Infantil A")
		} senao se (idade >=8 e idade<=11){
			escreva("O aluno deve ser matriculado na turma Infantil B")
		} senao se (idade >=12 e idade <=13){
			escreva("O aluno deve ser matriculado na turma Juvenil A")
		} senao se (idade >=14 e idade <=17){
			escreva("O aluno deve ser matriculado na turma Juvenil B")
		} senao se (idade>=18) {
			escreva("O aluno deve ser matriculado na turma Adultos")
		} senao {
			escreva("O aluno não tem idade para ser matriculado.\nA idade minima são 5 anos completos.")
		}

	escreva("\nFim do Programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 969; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */