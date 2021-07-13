package entities;

public class Revista extends Produto{
	private String editora;
	
	
	public Revista(String codigo, String nome) {
		super(codigo, nome);
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
