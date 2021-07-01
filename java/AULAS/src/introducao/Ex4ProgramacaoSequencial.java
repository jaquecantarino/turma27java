//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão:
//D=r+s/2 onde,
//r=a+b²
//s=b+c2

package introducao;

import java.util.Scanner;

public class Ex4ProgramacaoSequencial {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	int a, b, c, r, s, d;
	
	System.out.println ("Escolha um número para a:");
	a = leia.nextInt();
	System.out.println ("Escolha um número para b:");
	b = leia.nextInt();
	System.out.println ("Escolha um número para c:");
	c = leia.nextInt();

	r=(a+b)*(a+b);
	s=(b+c)*(b+c);
	d= (r + s)/2;
	
	System.out.printf("A composição de D é D=R+S/2 com resultado: %d",d);
	
	}
}
