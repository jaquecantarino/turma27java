//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//respectivamente.
package introducao;

import java.util.Scanner;

public class Ex5ProgramacaoSequencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double p1, p2, p3, mediaf;
		int nota1=2, nota2=3, nota3=5;
		
		System.out.println("Qual a nota P1?");
		p1 = leia.nextDouble();
		System.out.println("Qual a nota P2?");
		p2 = leia.nextDouble();
		System.out.println("Qual a nota P3?");
		p3 = leia.nextDouble();
		
		mediaf = (p1*nota1) + (p2*nota2) + (p3*nota3)/10;
		
		System.out.printf("A m�dia final do aluno �: %.1f",mediaf);
		
		

	}

}
