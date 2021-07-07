package introducao;

public class Carro {
	
	public int qtdeRodas;
	public String tipoDirecao;
	public String cor;
	public int ano;
	public String modelo;
	public boolean ligado;
	public int velocidade;
	
	public void ligarCarro() {
		ligado=true;
		System.out.println("Vrum...Vrum...Carro ligado!");
	}
	
	public void desligarCarro() {
		if(velocidade==0) {	
		ligado=false;
		System.out.println("Carro desligado!");
		} else {
			System.out.println("Desacelere o carro!");
		}
	}
	
	public void acelerarCarro() {
		velocidade++;
	}
	
	public void frearCarro() {
		velocidade--;
	}
}
