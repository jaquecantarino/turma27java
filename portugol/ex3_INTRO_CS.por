//Faça um sistema que leia o tempo de duração de um evento em uma 
//fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
programa {
	inteiro segundose, horas, minutos, segundos
	
	funcao inicio(){
		escreva ("Quantos segundos tem o evento?")
		leia(segundose)
		horas = segundose/3600
		minutos = (segundose%3600)/60
		segundos = (segundose%3600)%60
		escreva ("Seu evento tem ",horas," hora(s) ",minutos," minuto(s) e ",segundos," segundos de duração")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */