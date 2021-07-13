package introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaulistinhaOOP {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		List <Time> tabela = new ArrayList<>();
		
		tabela.add(new Time("Palmeiras"));
		tabela.add(new Time("Santos"));
		tabela.add(new Time("SPFC"));
		tabela.add(new Time("Corinthians"));
		
		tabela.add(0, new Time("MENGO")); // o 0 indica que é o item 0 da tabela.
		
		System.out.println(tabela.get(3).getNome());
		
		for (Time e: tabela) {
			System.out.println("Time de São Paulo: "+e.getNome());
		}
		
		//PESQUISAR INDEX OF.
		
		

	}

}
