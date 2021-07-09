package POO;

public class Aviao {
	
	public boolean ligado;
	public boolean turbinas;
	public boolean tremDePouso;
	public boolean portas;
	public String destino;
	public String modelo;
	public String responsavel;
	public int rodas;
	public String tipo;
	public boolean noAr;
	public int velocidade;
	
	public void Voo (){
		if(portas==true) {
			tremDePouso=false;
			turbinas=true;
			ligado=true;
		} else {
			System.out.println("Prepare a decolagem! ");
		}
		
	}
	
	public void registroDeVoo() {
		System.out.println("Destino: "+destino+" Piloto: "+responsavel);
	}
	
	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
	}
		
	public void decolando() {
		for (int x=1; x<=10; x++) {
			aumentarVelocidade();
		}
		
		noAr=true;
		
	}
	
	public void pousar() {
		for (int x=1; x<=10; x++) {
			diminuirVelocidade();
		}
		noAr=false;
		
	}
	
	public void aumentarVelocidade() {
		velocidade++;
	}
	
	public void aumentarVelocidade(int acrescimo) {
		velocidade = velocidade + acrescimo;
	}
	
	public void diminuirVelocidade() {
		velocidade--;
	}
	
	public void diminuirVelocidade(int decrescimo) {
		velocidade-= decrescimo;
	}

}
