//Solicitar a idade de várias pessoas e imprimir: 
//Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos.
//O programa termina quando idade for =-99. (WHILE)
package ListaLadoDeRepeticao;

import java.util.Scanner;

public class Ex3LacoDeRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade=0;
		int menosv=0, maisc=0;
		int contador=0;
		char op;
		
		while(idade<=99) {
			contador++;
			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();
			
			if(idade<21) {
				menosv++;
			} else if (idade>=50) {
				maisc++;
			}
			
			System.out.println("Deseja continuar? S-Sim ou N-Não: ");
			op = leia.next().charAt(0);
				if(op=='n' || op=='N') {
					break;
				}
		}
		
		System.out.printf("A quantidade de respostas foi: %d",contador);
		System.out.printf("\nA quantidade pessoas com menos de 21 anos é: %d",menosv);
		System.out.printf("\nA quantidade pessoas com mais de 50 anos é: %d",maisc);
	}

}
