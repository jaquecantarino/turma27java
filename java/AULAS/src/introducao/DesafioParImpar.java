package introducao;

import java.util.Scanner;

public class DesafioParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);//adicionando o scanner para ler o numero digitado
		
		int num; // declarando a variavel, que � inteiro e com nome num, abrevia��o de numero.
		
		System.out.println("Escolha um n�mero inteiro "); //mensagem pro cliente digitar o numero desejado.
		num = leia.nextInt(); // comando ler, guarda na variavel num o dado digitado pelo usuario
		
		if(num<0) { //se num for menor que 0, negativo.
			System.out.println("N�o � poss�vel calcular com n�mero negativo."); // devolve a mensagem que n�o calcula.
		}else if(num==0) { // senao se num for igual a zero
			System.out.println("N�mero 0 � neutro"); // devolve a mensagem 0
		} else if (num%2==0) { // senao se ele for divisivel por 2
			System.out.printf("O n�mero %d � par",num); // devolve a mensagem par
		} else { // senao, o que resta � impar.
			System.out.printf("O n�mero %d � �mpar",num); // devolve a mensagem impar.
		}
	}
}
