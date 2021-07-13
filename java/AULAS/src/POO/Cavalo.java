package POO;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.println("correndo!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println(super.getNome() + " iiirrrrí, rilinchin");
	}

}
