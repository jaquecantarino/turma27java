//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
//em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as 
//informa��es deste objeto no console.

package POO;

import java.util.Scanner;

public class Ex2POOAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Aviao voo1 = new Aviao();
		
		//pesquisar sobre o que colocar nessa parte sobre voos.
		
		System.out.println("Respons�vel pelo voo: ");
		voo1.responsavel = leia.next();
		System.out.println("Destino do voo: ");
		voo1.destino = leia.next();
		
		voo1.registroDeVoo();
		

	}

}
