//1) Crie uma classe cliente e apresente os atributos e métodos referentes 
//esta classe, em seguida crie um objeto cliente, defina as instancias deste 
//objeto e apresente as informações deste objeto no console.

package POO;

import java.util.Scanner;

import POO.Cliente;

public class Ex1PooCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Cliente cadastro1 = new Cliente();
		
		System.out.println("Cadastro de Clientes\n");
		System.out.println("Código de registro do Cliente: ");
		cadastro1.registro =  leia.nextInt();
		System.out.println("Qual primeiro nome do cliente?");
		cadastro1.nome = leia.next();
		System.out.println("Qual sobrenome do cliente?");
		cadastro1.sobrenome = leia.next();
		System.out.println("Qual gênero do cliente? F-Feminino / M-Masculino/ N-Não Binário");
		cadastro1.genero = leia.next().charAt(0);
		System.out.println("Qual a cidade do cliente?");
		cadastro1.cidade = leia.next();
		System.out.println("Telefone: ");
		cadastro1.telefone = leia.next();
		System.out.println("E-mail: ");
		cadastro1.email = leia.next();
		
		System.out.println("Cadastro Completo");
		cadastro1.cadastroCompleto();

	}

}
