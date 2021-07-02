//Faça um programa que receba a idade de uma pessoa e mostre na saída 
//em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto

package ListaLacoDeDecisao;

import java.util.Scanner;

public class Ex3LacoDeDecisao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Qual a idade do aluno?");
		idade=leia.nextInt();
		
		if(idade>=10 &&idade<=14) {
			System.out.println("O aluno deve ser matriculado na turma infantil.");
		} else if(idade>=15 &&idade<=17) {
			System.out.println("O aluno deve ser matriculado na turma juvenil.");
		} else if(idade<10) {
			System.out.println("O aluno não tem idade para ser matriculado.");
		} else {
			System.out.println("O aluno deve ser matriculado na turma adulto.");
		}
		
		

	}

}
