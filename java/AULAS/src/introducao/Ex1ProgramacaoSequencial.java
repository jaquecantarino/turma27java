//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
package introducao;

import java.util.Scanner;

public class Ex1ProgramacaoSequencial {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dia, mes, ano, dian, mesn, anon, diasTotais;
		
		System.out.println ("Qual o dia do seu nascimento?");
		dia = leia.nextInt();
		
		System.out.println ("Qual o m�s do seu nascimento?");
		mes = leia.nextInt();
	
		System.out.println ("Qual o ano do seu nascimento?");
		ano = leia.nextInt();
		
		System.out.println ("Que dia � hoje?");
		dian = leia.nextInt();
		
		System.out.println ("Em que m�s estamos?");
		mesn = leia.nextInt();
		
		System.out.println ("Qual ano atual?");
		anon = leia.nextInt();
		
		diasTotais = (dian - dia) + ((mesn - mes)*30) + ((anon-ano)*365);
		System.out.printf("Voc� tem: %d dias de vida!",diasTotais);
	
	}
}
