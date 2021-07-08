package POO;

public class Aviao {
	
	public boolean ligado;
	public boolean turbinas;
	public boolean tremDePouso;
	public boolean portas;
	public String destino;
	public String modelo;
	public String responsavel;
	
	
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
	
	//System.out.println("Avião: "+modelo);

}
