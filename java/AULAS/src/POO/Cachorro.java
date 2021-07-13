package POO;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.println("correndo!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println(super.getNome() + "Au Au Au!");
	}
}
