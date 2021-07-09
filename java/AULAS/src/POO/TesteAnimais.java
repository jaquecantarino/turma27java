//Implemente um programa que crie os 3 tipos de animais 
//definidos no exercício anterior e invoque o método que emite
//o som de cada um de forma polimórfica, isto é, independente 
//do tipo de animal.

package POO;

import POO.Animal;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro freddy = new Cachorro("Freddy",9);
		Cavalo horse = new Cavalo("Horse",15);
		Preguica soninho = new Preguica("Soninho",6);
		Cachorro manu = new Cachorro("Manu",7);
		
		System.out.println("Nome: "+freddy.getNome());
		System.out.println("Idade: "+freddy.getIdade()+" anos");
		freddy.emitirSom();
		freddy.correr();
		System.out.println("Nome: "+horse.getNome());
		

	}

}
