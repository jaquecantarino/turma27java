package introducao;

import java.util.Scanner;

public class IdadeLeia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		String nome;
		
		System.out.println("Qual seu nome?");
		nome = leia.next();
		System.out.println("Qual seu ano de nascimento?");
		anoNascimento = leia.nextInt();
		
		System.out.printf("Olá %s sua idade é %d anos.",nome,(2021-anoNascimento));

	}

}
