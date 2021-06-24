//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
programa {
	real p1, p2, p3, mediaf
	inteiro nota1=2, nota2=3, nota3=5
	
	funcao inicio() {
		escreva ("Primeira nota:")
		leia(p1)
		escreva ("Segunda nota:")
		leia(p2)
		escreva ("Terceira nota:")
		leia(p3)
		mediaf = ((p1*nota1) + (p2*nota2) + (p3*nota3)) /10
		escreva ("A média final é: ",mediaf)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */