package introducao;

public class Temperatura {

	public static void main(String[] args) {
	//room	2 = Celsius para Fahrenheit
		
		double celsius=13.00;
		double fahrenheit=0.00;
		double kelvin=0.00;
		String nome="Ed";
		
		System.out.println(nome+" a temperatura em �C �: "+celsius);
		
		fahrenheit=(celsius*1.8)+32;
		System.out.printf("Ent�o a temperatura em �F �: %.2f\n",fahrenheit);
		
		kelvin=celsius+273.15;
		System.out.println("\nE a temperatura em Kelvin seria: "+kelvin);
		
	}

}
