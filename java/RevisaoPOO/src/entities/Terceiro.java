package entities;

public class Terceiro extends Funcionario {
	//atributo especial dessa subclasse
	private double adicional;
	
	//construtor um, com todos os dados essenciais
	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	//sobrecarga 
	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	} //apenas matricula e adicional
	
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	//metodos
	//overhide = sobrecarga da sobrecarga
	@Override
	public double salario() {
		return (this.horasTrabalhadas * this.valorHora) + adicional ; // faço assim usando atributo protected
		//return (super.getHorasTrabalhadas() * super.getValorHoras()) + adicional; // quando o atributo não é protected
	}
	

	

}
