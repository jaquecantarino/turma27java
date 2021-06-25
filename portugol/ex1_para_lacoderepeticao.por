// 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  

programa{
	
	funcao inicio(){
		inteiro pop=1, filhos=0, contador=0, total_filhos=0, salario100=0, media_filhos=0
		real media_salario=0.00, maior_salario=0.00, percentual=0.0, salario=0.00, total_salario=0.00
	
		para(pop=1; pop<=3; pop++){
			escreva("Quantos filhos você tem?")
			leia(filhos)
			total_filhos += filhos
			escreva("Qual valor do seu salario?")
			leia(salario)
			total_salario = (total_salario + salario )
				se (salario <=100){
					salario100++
				}
				

				se (salario>maior_salario){
					maior_salario = salario
					}

			limpa()

		}
		
		media_filhos = total_filhos / pop
		media_salario= total_salario/ pop	
		percentual= (salario100*100) / (pop-1)
		
		escreva("\nPesquisa efetuada pela prefeitura\n")
		escreva("\nA média do sálario da população é: ",media_salario,"\n")
		escreva("\nA média de filhos por habitante é: ",media_filhos,"\n")
		escreva("\nO maior salario entre os habitantes é: ",maior_salario,"\n")
		escreva("\nA pesquisa aponta que ",percentual," % de habitantes recebem até R$100,00\n")
		
		escreva("\nFim do programa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */