package principal;

import java.util.Scanner;

import objetos.Funcoes;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Funcoes funcao = new Funcoes();
		
		Boolean menu=true;
		
		while(menu)
		{
			System.out.println("[1] cadastrar novo produto \n[2] exibir lista \n[3] sair \nsua escolha: ");
			int esc = scan.nextInt();
			
			if(esc==1)
			{
				funcao.cadastrarProduto();
			}
			else if(esc==2)
			{
				funcao.exibirLista();
			}
			else if(esc==3)
			{
				menu=false;
			}
			else
			{
				System.out.println("Escolha invalida!");
			}
		}

	}

}
