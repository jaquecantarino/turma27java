//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
//do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
//distribuidor seja de 28% e os impostos de 45%, 
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor
//28%= 0,28 -- 45%=0,45

programa{
	funcao inicio() {
		
		real custof, porcdis, imposto, carro
		
		escreva("Qual valor de fabrica do carro em reais?")
		leia(custof)
		escreva("Qual a percentagem do distribuidor?")
		leia(porcdis)
		escreva("Qual a porcentagem de impostos?")
		leia(imposto)
		carro = custof + (custof*(porcdis/100)) + (custof*(imposto/100))
		escreva("O custo ao consumidor do carro é: " ,carro, " de reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 696; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */