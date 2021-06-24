// desafio: Pedir nome e ano de nascimento.
// Igual ou mais de 35 anos exibir "você é cringe", encerrar o programa se não entrar nessa condição.
programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anonasc, idade

		 escreva("Qual seu nome? ")
		 leia(nome)
		 escreva("Qual o ano do seu nascimento? ")
		 leia(anonasc)

		 idade= 2021-anonasc

		 se(idade>=35){
		 	escreva("Olá ",nome," sua idade é: ",idade," então você é cringe \n")
		 } senao {
		 	
		 }
	escreva ("Fim de programa!")
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