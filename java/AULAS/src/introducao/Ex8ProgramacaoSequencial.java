//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica 
//com a percentagem do distribuidor e dos impostos (aplicados ao custo de 
//f�brica).Supondo que a percentagem do distribuidor seja de 28% e os 
//impostos de 45%,escrever um sistema que leia o custo de f�brica de um
// carro e escreva o custo ao consumidor.
package introducao;

import java.util.Scanner;

public class Ex8ProgramacaoSequencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double custof, porcdis, imposto, carro;
		
		System.out.println("Qual valor de fabrica do carro em reais?");
		custof = leia.nextDouble();
		
		System.out.println("Qual a percentagem do distribuidor?");
		porcdis = leia.nextDouble();
		porcdis = porcdis/100;

		System.out.println("Qual a percentagem do imposto?");
		imposto = leia.nextDouble();
		imposto = imposto/100;
		
		carro = custof + (custof*porcdis) + (custof*imposto);
		
		System.out.printf("O valor final do carro �: %.2f. \nA porcentagem do distribuidor �: %.2f \nA porcentagem de impostos �: %.2f",carro,(custof*porcdis),(custof*imposto));
	}

}
