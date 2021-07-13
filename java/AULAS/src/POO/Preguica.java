package POO;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore() {
		System.out.println("subindo na arvore.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println(super.getNome() + " está fazendo barulho.");
	}
}
