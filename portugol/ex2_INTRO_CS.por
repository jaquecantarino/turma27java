//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos,
//meses e dias.
programa{
	inteiro dias, mes, ano, dia
	
	funcao inicio() {
		escreva ("Quantos dias de vida você tem?")
		leia(dias)
		ano = dias/365
		mes = (dias%365)/30
		dia = (dias%365)%30
		escreva ("Você tem: ",ano," anos ", mes," mes(es) e ", dia," dias de vida!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */