package POO;

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
