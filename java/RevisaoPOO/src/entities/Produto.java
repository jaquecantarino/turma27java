package entities;

public class Produto {
		private String nome;
		private String codigo;
		private double valorUnitario;
		private int estoque;
		
		
		
		public Produto(String codigo, String nome) {
			super();
			this.codigo = codigo;
		}
		
		

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public double getValorUnitario() {
			return valorUnitario;
		}

		public void setValorUnitario(double valorUnitario) {
			this.valorUnitario = valorUnitario;
		}

		public int getEstoque() {
			return estoque;
		}
		
		
		
		public void colocarEstoque(int valorIncluir) {
			estoque = estoque + valorIncluir;
		}
		
		public void tirarEstoque(int valorTirar) {
			estoque = estoque - valorTirar;
		}

}
