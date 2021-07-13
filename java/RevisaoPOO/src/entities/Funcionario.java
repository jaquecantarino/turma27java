package entities;

public class Funcionario {
	private String matricula;
	protected int horasTrabalhadas; // as sub podem mexer.
	protected double valorHora; // as subs podem mexer.
	
	//construtor
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	//sobrecarga de construtor
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	} //apenas matricula



	public String getMatricula() {
		return matricula;
	}

	/*public void setMatricula(String matricula) {
		this.matricula = matricula;
	}*/

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double salario() {
		return this.horasTrabalhadas * this.valorHora;
	}
	

}
