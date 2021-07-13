package POO;

public class Patinete {
	public String cor;
	public int qtdRodas;
	public boolean eletrico;
	public int bateria;
	public boolean ligado;
	
	public void ligar() {
		if(eletrico=true) {
			if(bateria<=20)
				ligado = false;
			System.out.println("Recarregue.");
		} else if (bateria >40) {
			ligado = true;
			System.out.println("Ligando patinete.");	
		}	
	}
	
	public void desligar() {
		ligado=false;
		System.out.println("Desligando patinete.");
	}
	
	public void verificarBateria() {
		if(bateria<10) {
			System.out.println("Bateria muito baixa, conecte no carregador.");
		} else if(bateria<30) {
			System.out.println("Bateria média, considere viagens curtas.");
		}else if(bateria<60) {
			System.out.println("Bateria abaixo de 60%, verifique sua rota!");
		} else if(bateria>60) {
			System.out.println("Bateria carregada!");
		}
	}
	
	public void fichaTecnica() {
		System.out.println(cor+"\t"+qtdRodas+"\t"+eletrico);
	}
	
	
	

}
