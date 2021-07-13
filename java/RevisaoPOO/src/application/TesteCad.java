package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("102030", 40, 20.50);
		Terceiro ter1 = new Terceiro("201030", 80, 15.00, 100.20);
		
		System.out.println("Funcionario CLT");
		System.out.println("Matricula: "+func1.getMatricula());
		System.out.println("Salario atual: R$"+func1.salario());
		
		System.out.println("Funcionario Terceiro");
		System.out.println("Matricula: "+ter1.getMatricula());
		System.out.println("Salario atual: R$"+ter1.salario());
	}

}
