package introducao;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String alunos[] = {"FELIPE","JAQUELINE","BARBARA","EDNILSON"};
		int notas[] = new int[4];
		String matricula[] = new String[4];
		String aux;
		
		//System.out.println(alunos[2].toLowerCase());
		
		System.out.println("Cadastro de notas");
		for(int x = 0; x <alunos.length;x++) {
			System.out.println("Aluno[a]: " +(x+1));
			matricula[x]= "GEN - "+(x+1);
			System.out.println("Matricula "+ matricula[x]+ " Aluno[a]: "+alunos[x]);
			notas[x] = read.nextInt();
		}
		
		System.out.println("BOLETIM");
		for(int x=0; x < alunos.length; x++) {
			if(notas[x]>=5) {
				System.out.printf("%s - %d Nota: %d APROVADO\n",matricula[x],alunos[x],notas[x]);
			}else {
				System.out.printf("%s - %d Nota: %d Ainda não, continue estudando !\n",matricula[x],alunos[x],notas[x]);
			}
		}
		
		/*for (String x : alunos) {
			//System.out.println(x);
		}*/
		System.out.println("Escolha o aluno que deseja pesquisar a nota pela matricula");
		System.out.println("Digite a matricula");
		aux = read.next().toUpperCase();
		
		for(int x = 0; x < alunos.length; x++) {
			if(matricula[x].equals(aux)) {
				if(notas[x]>=5) {
					
					System.out.printf("%s - %d Nota: %d \n",matricula[x],alunos[x].toUpperCase(),notas[x]);
				
				}else {
					System.out.printf("%s - %d Nota: %d Ainda não, continue estudando !\n",matricula[x],alunos[x].toUpperCase(),notas[x]);
				}
			}
		}
	}

}