package introducao;

import java.util.Scanner;

public class DesafioParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);//adicionando o scanner para ler o numero digitado
		
		int num; // declarando a variavel, que é inteiro e com nome num, abreviação de numero.
		
		System.out.println("Escolha um número inteiro "); //mensagem pro cliente digitar o numero desejado.
		num = leia.nextInt(); // comando ler, guarda na variavel num o dado digitado pelo usuario
		
		if(num<0) { //se num for menor que 0, negativo.
			System.out.println("Não é possível calcular com número negativo."); // devolve a mensagem que não calcula.
		}else if(num==0) { // senao se num for igual a zero
			System.out.println("Número 0 é neutro"); // devolve a mensagem 0
		} else if (num%2==0) { // senao se ele for divisivel por 2
			System.out.printf("O número %d é par",num); // devolve a mensagem par
		} else { // senao, o que resta é impar.
			System.out.printf("O número %d é ímpar",num); // devolve a mensagem impar.
		}
	}
}
