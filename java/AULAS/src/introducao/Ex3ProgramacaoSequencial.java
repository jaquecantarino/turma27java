//3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
package introducao;

import java.util.Scanner;

public class Ex3ProgramacaoSequencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int segundosE, horas, minutos, segundos;
		
		System.out.println("Qual dura��o do evento em segundos?");
		segundosE = leia.nextInt();
		
		horas = segundosE/3600;
		minutos = (segundosE%3600)/60;
		segundos = (segundosE%3600)%60;
		
		System.out.printf("Seu evento tem %d hora(s), %d minuto(s) e %d segundo(s) de dura��o",horas,minutos,segundos);
	}

}
