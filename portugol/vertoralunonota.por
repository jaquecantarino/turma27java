//

programa{
	
	funcao inicio(){
		cadeia aluno[4]
		inteiro nota[4]
		cadeia nome

		escreva("Boletinho do Ed\n")

		para(inteiro x=0; x<4; x++){
			escreva ("Escreva o nome do aluno: ")
			leia(aluno[x])
			escreva ("Qual a nota do aluno: ")
			leia(nota[x])
			limpa()
		}

		
		//esse para vai mostrar as notas de todos os alunos
		//para(inteiro x=0; x<4; x++){
		//	se(nota[x]<=5)
		//		escreva("\nOlá ",aluno[x]," sua nota é: ",nota[x]," você não passou")
		//	se(nota[x]>5){
		//		escreva("\nOlá ",aluno[x]," sua nota é: ",nota[x]," você está aprovado.")				
		//	}

		//aqui vocÊ escolhe o aluno que quer ver a nota
		escreva("Digite o nome do aluno: ")
		leia(nome)

		para (inteiro x=0; x<4; x++){
			se(nome==aluno[x]){
				//escreva("Olá ",aluno[x]," sua nota é ",nota[x])
				se(nota[x]<=5)
				escreva("\nOlá ",aluno[x]," sua nota é: ",nota[x]," você não passou")
				se(nota[x]>5){
				escreva("\nOlá ",aluno[x]," sua nota é: ",nota[x]," você está aprovado.")				
			}
			}
			//senao{
			//	escreva("Aluno não encontrado")
			}
	}
		}
		
		
		
	escreva("\nFim do Programa!")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1027; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */