//2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto avião, defina as instancias deste objeto e apresente as 
//informações deste objeto no console.

package POO;

import java.util.Scanner;

public class Ex2POOAviao {

	public static void main(String[] args) {
	
	Aviao aviao1 = new Aviao();  //instaciar 
	
	
	aviao1.modelo = "BIMOTOR";
	aviao1.rodas = 3;
	aviao1.tipo = "PASSAGEIRO 14 LUGARES";
	aviao1.noAr = false;
	aviao1.ligado = false;
	aviao1.velocidade=0;
	
	//vamos colocar essa aviao pra voar....
	System.out.println("SITUAÇÃO DO AVIAO....");
	System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	System.out.println("VAMO PRA PISTA");
	aviao1.ligar(); 
	aviao1.aumentarVelocidade();
	aviao1.aumentarVelocidade();
	aviao1.aumentarVelocidade();
	aviao1.diminuirVelocidade();
	aviao1.diminuirVelocidade();
	aviao1.diminuirVelocidade();
	System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	aviao1.decolando();
	aviao1.aumentarVelocidade(40);
	System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	aviao1.diminuirVelocidade(40);
	System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	aviao1.pousar();
	System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	aviao1.desligar();
	System.out.println("Velocimentro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
	
	Scanner leia = new Scanner (System.in);
	Aviao voo1 = new Aviao();
	
	//pesquisar sobre o que colocar nessa parte sobre voos.
	
	System.out.println("Responsável pelo voo: ");
	voo1.responsavel = leia.next();
	System.out.println("Destino do voo: ");
	voo1.destino = leia.next();
	
	voo1.registroDeVoo();
}

}
