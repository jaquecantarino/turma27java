//Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas 
//psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das 
//pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
///e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se 
//a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler 
//os dados de 150 pessoas, calcule e mostre: (WHILE)
//n�mero de pessoas calmas; 
//n�mero de mulheres nervosas; 
//n�mero de homens agressivos; 
//n�mero de outros calmos;
//n�mero de pessoas nervosas com mais de 40 anos; 
//n�mero de pessoas calmas com menos de 18 anos.

package ListaLadoDeRepeticao;

import java.util.Scanner;

public class Ex4LacoDeRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	int num=0; //at� 150;
	int calma=0, mnervosa=0, hagressivo=0, ocalmo=0, mquarenta=0, menor=0;
	int idade, sexo, caracteristica;
	char op;
	
	while(num<=150) {
		num++;
		System.out.println("Qual sua idade?");
		idade = leia.nextInt();
		System.out.println("Qual seu genero: 1-Feminino  2-Masculino  3-Outros");
		sexo = leia.nextInt();
		System.out.println("Voc� se considera: 1-Calma  2-Nervosa  3-Agressiva");
		caracteristica = leia.nextInt();
		
		if((idade<=17) && caracteristica==1) {
			menor++;
		} else if(idade>=40 && caracteristica ==2) {
			mquarenta++;
		} 
		
		if(sexo==1 && caracteristica ==2) {
			mnervosa++;
		} else if(sexo==2 && caracteristica==3) {
			hagressivo++;
		}else if(sexo==3 && caracteristica==1) {
			ocalmo++;
		}
		
		if(caracteristica ==1) {
			calma++;
		}
		System.out.println("Deseja continuar? S-Sim ou N-N�o?");
		op = leia.next().charAt(0);
			if(op=='n' || op=='N') {
				break;
			}		
		
	}
	System.out.printf("Pesquisa efetuada com %d voluntarios.\n\n",num);
	System.out.printf("O n�mero de pessoas calmas �: %d",calma);
	System.out.printf("\nO n�mero de mulheres nervosas �: %d",mnervosa );
	System.out.printf("\nO n�mero de homens agressivos �: %d",hagressivo);
	System.out.printf("\nO n�mero de outros calmos �: %d",ocalmo);
	System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos �: %d",mquarenta);
	System.out.printf("\nO n�mero de pessoas calmas com menos de 18 anos �: %d",menor);

	}

}
