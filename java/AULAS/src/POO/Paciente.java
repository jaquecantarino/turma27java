package POO;

public class Paciente {
	private String nome;
	private int idade;
	private String ala;
	private String medicoResp;
	
	public Paciente(String nome, int idade, String ala, String medicoResp) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.ala = ala;
		this.medicoResp = medicoResp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAla() {
		return ala;
	}

	public void setAla(String ala) {
		this.ala = ala;
	}

	public String getMedicoResp() {
		return medicoResp;
	}

	public void setMedicoResp(String medicoResp) {
		this.medicoResp = medicoResp;
	}
	
	public void resumoPaciente() {
		System.out.println("Paciente: "+nome+"\tSetor: "+ala);
		System.out.println("Idade: "+idade+"\t Médico: "+medicoResp);
	}
}
