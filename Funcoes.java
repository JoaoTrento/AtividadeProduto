package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
	
	public static Scanner scan = new Scanner(System.in);
	ArrayList<Produto> listaDeProdutos = new ArrayList<>();
	Integer id=0;
	
	public void cadastrarProduto() {
		
		id++;
		
		System.out.println("Insira o nome do produto: ");
		String nome = scan.nextLine();
		
		System.out.println("Insira o preço do produto: ");
		Double preco = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Insira a quantidade do produto: ");
		Integer quantidade = scan.nextInt();
		scan.nextLine();
		
		Produto produto = new Produto(nome, preco, quantidade, id);
		
		listaDeProdutos.add(produto);
		
	}
	
	public void exibirLista() {
		
		for (Produto produto : listaDeProdutos) 
		{
			System.out.println(produto);
		}
	}
}
