//6. Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
//A fórmula que efetua tal cálculo é:
// d = raiz quadrade de : (x2-x1)² + (y2-y1)² 

package introducao;

import java.util.Scanner;

public class Ex6ProgramacaoSequencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		double x1, y1, x2, y2, d;
		
		System.out.println("Qual ponto X1?");
		x1 = leia.nextDouble();
		System.out.println("Qual ponto X2?");
		x2 = leia.nextDouble();
		System.out.println("Qual ponto Y1?");
		y1 = leia.nextDouble();
		System.out.println("Qual ponto Y2?");
		y2 = leia.nextDouble();
		
		//d= Math.raiz ((Math.potencia ((x2 - x1),2)) + (Math.potencia ((y2 - y1),2)),2)
		d= Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.printf("O resultado da raiz é: %.2f",d);
		
	}

}
