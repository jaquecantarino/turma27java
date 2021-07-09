package POO;

import POO.Funcionario;

public class Ex4Funcionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Jaque", 102030, "Aula", true, "Jess");
		func1.setTelefone("956849863");
		func1.setMesAniversario(2);
		func1.setDiaAniversario(21);
		func1.setAnoAniversario(1997);
		func1.setIdade(24);
		
		
		func1.cadastroFuncionario();

	}

}
