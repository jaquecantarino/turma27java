package POO;

public class Ex3PooEletronico {

	public static void main(String[] args) {
		
		Eletronico liquidificador = new Eletronico(true,110,"Liquidificador");
		
		liquidificador.setLigado(false);
		liquidificador.setVoltagem(220);
		System.out.println("A voltagem do liquidificador é: "+liquidificador.getVoltagem());

	}

}
