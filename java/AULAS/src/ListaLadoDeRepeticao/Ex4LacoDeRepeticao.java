//Uma empresa desenvolveu uma pesquisa para saber as características 
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das 
//pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
///e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se 
//a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler 
//os dados de 150 pessoas, calcule e mostre: (WHILE)
//número de pessoas calmas; 
//número de mulheres nervosas; 
//número de homens agressivos; 
//número de outros calmos;
//número de pessoas nervosas com mais de 40 anos; 
//número de pessoas calmas com menos de 18 anos.

package ListaLadoDeRepeticao;

import java.util.Scanner;

public class Ex4LacoDeRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	int num=0; //até 150;
	int calma=0, mnervosa=0, hagressivo=0, ocalmo=0, mquarenta=0, menor=0;
	int idade, sexo, caracteristica;
	char op;
	
	while(num<=150) {
		num++;
		System.out.println("Qual sua idade?");
		idade = leia.nextInt();
		System.out.println("Qual seu genero: 1-Feminino  2-Masculino  3-Outros");
		sexo = leia.nextInt();
		System.out.println("Você se considera: 1-Calma  2-Nervosa  3-Agressiva");
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
		System.out.println("Deseja continuar? S-Sim ou N-Não?");
		op = leia.next().charAt(0);
			if(op=='n' || op=='N') {
				break;
			}		
		
	}
	System.out.printf("Pesquisa efetuada com %d voluntarios.\n\n",num);
	System.out.printf("O número de pessoas calmas é: %d",calma);
	System.out.printf("\nO número de mulheres nervosas é: %d",mnervosa );
	System.out.printf("\nO número de homens agressivos é: %d",hagressivo);
	System.out.printf("\nO número de outros calmos é: %d",ocalmo);
	System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é: %d",mquarenta);
	System.out.printf("\nO número de pessoas calmas com menos de 18 anos é: %d",menor);

	}

}
