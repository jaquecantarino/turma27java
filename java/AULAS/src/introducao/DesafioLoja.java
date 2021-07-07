//Loja - Definir nome.
// Vetores: Produtos, preço, código, estoque.
//Cadastro de 10 produtos.
package introducao;

import java.util.Scanner;

public class DesafioLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		//String produto[] = new String[10].
		//double preco[] = {};
		String codigo[] = new String[10];
		//int estoque[] = new int[10];
		String aux;
		int carrinho;
		
		System.out.println("Papelaria Ediscola");
		
		String produto[]= {"Lápis 2.0","\nBorracha Rosa","\nCaderno de Desenho","\nLapiseira 7.0","\nLapiseira 9.0","\nCaneta Ponta 1.0","\nCaneta Azul","\nCaneta Rosa","\nCaneta Preta","\nCola Bastão"};
		double preco[] = {2.00, 0.50, 15.00, 3.50, 3.60, 0.70, 0.70, 0.70, 0.70, 1.50};
		int estoque[] = {10,10,10,10,10,10,10,10,10,10};
		
		for(int x=0; x<=9; x++) {
			codigo[x]="G1-"+(x+1);
		}
		
		  for(int i=0;i<produto.length;i++)
			  if(produto[i] != null) {
			  System.out.println("Produto:"+produto[i]+"\tCódigo:"+codigo[i]+"\tValor R$ %.2f"+preco[i]+"\tEstoque: "+estoque[i]);   
			  }

			System.out.println("Qual item deseja comprar? ");
			aux = leia.next();
			System.out.println("Qual a quantidade?");
			carrinho =leia.nextInt();
			
			//if(carrinho>estoque[x]) {
			//	System.out.println("Estoque indisponivel!");
			//} else if (carrinho<=estoque[x]) {
			//	estoque[x]-=carrinho;
			//}
			

		

		
		

	}

}
