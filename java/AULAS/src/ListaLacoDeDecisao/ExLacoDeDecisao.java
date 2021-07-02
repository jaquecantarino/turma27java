//Fa�a um programa em que permita a entrada de um n�mero qualquer e 
//exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
//raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
package ListaLacoDeDecisao;

import java.util.Scanner;

public class ExLacoDeDecisao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double num, raiznum, pownum;
		
		System.out.println("Digite um n�mero inteiro: ");
		num = leia.nextDouble();
		
		if(num<0) {
			System.out.println("N�mero negativo.");
		} else if(num%2==0) {
			raiznum = Math.sqrt(num);
			System.out.printf("A ra�z quadrada de %.1f �: %.2f",num,raiznum);
		} else {
			pownum = Math.pow(num, 2);
			System.out.printf("O n�mero %.1f elevado ao quadrado �: %.2f",num,pownum);
		}

	}

}
