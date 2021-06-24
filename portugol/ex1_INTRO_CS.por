//1-Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
programa {
	
	funcao inicio() {
		inteiro dia, mes, ano, dian, mesn, anon, dias_totais
			
		escreva("Qual o dia do seu nascimento?")
		leia(dia)
		escreva("Qual o mês do seu nascimento?")
		leia(mes)
		escreva("Qual qual o ano do seu nascimento?")
		leia(ano)
		escreva ("Qual dia de hoje?")
		leia(dian)
		escreva ("Qual mes atual?")
		leia(mesn)
		escreva ("Qual ano atual?")
		leia(anon)
		dias_totais = (dian - dia) + ((mesn - mes)*30) + ((anon-ano)*365)
		escreva("Você tem: ",dias_totais," dias de vida!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */