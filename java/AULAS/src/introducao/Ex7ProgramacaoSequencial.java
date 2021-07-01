//7-Um sistema de equa��es lineares do tipo: ax+by/dx+ey
//, pode ser resolvido segundo mostrado abaixo : 
//x=ce-bf/ae-bd  y=af-cd/ae-bd
// Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e 
//mostra os valores de x e y. 
package introducao;

import java.util.Scanner;

public class Ex7ProgramacaoSequencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digita um n�mero para a:");
		a = leia.nextDouble();
		System.out.println("Digita um n�mero para b:");
		b = leia.nextDouble();
		System.out.println("Digita um n�mero para c:");
		c = leia.nextDouble();
		System.out.println("Digita um n�mero para d:");
		d = leia.nextDouble();
		System.out.println("Digita um n�mero para e:");
		e = leia.nextDouble();
		System.out.println("Digita um n�mero para f:");
		f = leia.nextDouble();
		
		x= ((c*e)-(b*f)) / ((a*e)-(b*d));
		y= ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.printf("Considerando que x=ce-bf/ae-bd e y=af-cd/ae-bd, o resultado de x �: %.2f e o resultado de y �: %f.2",x,y);
		

	}

}
