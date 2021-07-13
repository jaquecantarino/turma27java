package POO;

public class Eletronico {
	
	private boolean ligado;
	private int voltagem;
	private String utilidade;
	
	public Eletronico(boolean ligado, int voltagem, String utilidade) {
		super();
		this.ligado = ligado;
		this.voltagem = voltagem;
		this.utilidade = utilidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getUtilidade() {
		return utilidade;
	}

	public void setUtilidade(String utilidade) {
		this.utilidade = utilidade;
	}
	
	public void ligar() {
		
	}

}
