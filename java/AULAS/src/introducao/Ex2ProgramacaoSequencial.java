//2. Fa�a um sistema que leia a idade de uma pessoa expressa em 
//dias e mostre-a expressa em anos, meses e dias.
package introducao;

	import java.util.Scanner;
	
public class Ex2ProgramacaoSequencial {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, mes, ano, dia;
		
		System.out.println("Quantos dias de vida voc� tem?");
		dias = leia.nextInt();
		
		ano = dias/365;
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		
		System.out.printf("Voc� tem %d anos, %d meses e %d dias de vida!",ano,mes,dia);

	}
}	