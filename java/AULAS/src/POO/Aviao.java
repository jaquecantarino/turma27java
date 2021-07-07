package POO;

public class Aviao {
	
	boolean ligado;
	boolean turbinas;
	boolean tremDePouso;
	boolean portas;
	String destino, modelo, responsavel;
	
	
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
