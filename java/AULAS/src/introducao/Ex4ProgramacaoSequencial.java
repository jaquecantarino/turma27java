//4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
//calcule a seguinte express�o:
//D=r+s/2 onde,
//r=a+b�
//s=b+c2

package introducao;

import java.util.Scanner;

public class Ex4ProgramacaoSequencial {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	int a, b, c, r, s, d;
	
	System.out.println ("Escolha um n�mero para a:");
	a = leia.nextInt();
	System.out.println ("Escolha um n�mero para b:");
	b = leia.nextInt();
	System.out.println ("Escolha um n�mero para c:");
	c = leia.nextInt();

	r=(a+b)*(a+b);
	s=(b+c)*(b+c);
	d= (r + s)/2;
	
	System.out.printf("A composi��o de D � D=R+S/2 com resultado: %d",d);
	
	}
}
