package application;

import entities.Revista;
import entities.Salgadinho;

public class Banca {

	public static void main(String[] args) {
		
		Revista prod1 = new Revista("001","ABRIL");
		Salgadinho prod2 = new Salgadinho("002","FOFURA");
		
		prod1.setNome("CLAUDIA");
		prod1.colocarEstoque(10);
		
		prod1.tirarEstoque(5);
		
		System.out.println(prod1.getNome()+" - "+prod1.getEstoque());

	}

}
