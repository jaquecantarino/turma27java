package POO;

public class Funcionario {
	private String nome;
	private int matricula;
	private String departamento;
	private boolean ativo;
	private String telefone;
	private String supervisor;
	private double salario;
	private int diaAniversario;
	private int mesAniversario;
	private int anoAniversario;
	private int idade;
	
	
	public Funcionario(String nome, int matricula, String departamento, boolean ativo, String supervisor) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.departamento = departamento;
		this.ativo = ativo;
		this.supervisor = supervisor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}


	public double getSalario() {
		return salario;
	}


	/*public void setSalario(double salario) {
		this.salario = salario;
	}*/


	public int getDiaAniversario() {
		return diaAniversario;
	}


	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}


	public int getMesAniversario() {
		return mesAniversario;
	}


	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}


	public int getAnoAniversario() {
		return anoAniversario;
	}


	public void setAnoAniversario(int anoAniversario) {
		this.anoAniversario = anoAniversario;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public void cadastroFuncionario() {
		System.out.println("Resumo cadastro funcionario:");
		System.out.println(matricula+"\t"+nome+"\t"+ativo);
		System.out.println(departamento+"\t"+supervisor);
		System.out.println(idade+"\t"+telefone);
	}
	
	
	
}
