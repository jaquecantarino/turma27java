package POO;

public class Cliente {
	
	String nome, sobrenome;
	int anoNascimento;
	char genero;
	int registro;
	String cidade;
	String telefone;
	String email;
	
	public void cadastroCompleto() { 
		System.out.println("Cliente: "+registro+"\t"+nome+" "+sobrenome);
		int idade = (2021-anoNascimento);
		System.out.println("Idade:"+idade+"\tGênero: "+genero);
		System.out.println("Endereço: "+cidade);
		System.out.println("COntato: "+telefone+"\t"+email);	
	}
	
	
	

}
