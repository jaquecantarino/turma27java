package introducao;

public class Temperatura {

	public static void main(String[] args) {
	//room	2 = Celsius para Fahrenheit
		
		double celsius=13.00;
		double fahrenheit=0.00;
		double kelvin=0.00;
		String nome="Ed";
		
		System.out.println(nome+" a temperatura em ºC é: "+celsius);
		
		fahrenheit=(celsius*1.8)+32;
		System.out.printf("Então a temperatura em ºF é: %.2f\n",fahrenheit);
		
		kelvin=celsius+273.15;
		System.out.println("\nE a temperatura em Kelvin seria: "+kelvin);
		
	}

}
