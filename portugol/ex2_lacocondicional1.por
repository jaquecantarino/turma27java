//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
//trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
//caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do 
//processamento imprimir o salário total e o salário excedente.
programa{
	
	funcao inicio(){
		real salario_total, salario_excedente, total, salario
		cadeia codigo
		inteiro nhoras, hora_excedente=0.00

		escreva("Qual código do funcionário? ")
		leia(codigo)		
		escreva("Qual quantidade de horas trabalhadas? ")
		leia(nhoras)
		limpa()

		se (nhoras<=50){
			salario_total = nhoras * 10
			escreva("O funcionário ",codigo," trabalhou ",nhoras," horas esse mês.")
			escreva("\nSeu excedente é: ",hora_excedente," horas")
			escreva("\nEntão seu salário será de ",salario_total, " reais! \n")
		} senao {
			hora_excedente = nhoras - 50 
			salario_excedente = hora_excedente * 20
			salario = (nhoras - hora_excedente)*10
			total = salario + salario_excedente

			escreva ("O funcionário " ,codigo, " trabalhou " ,nhoras, " horas esse mês. \n")
			escreva ("O salario total é de: ",salario," reais. \n")
			escreva ("O salario excedente é de: ",salario_excedente," reais. \n")
			escreva ("O recebimento deve ser de: ",total," reais \n")
		}

		escreva("Fim do programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 909; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */