package lab3;

import java.util.Scanner;

import lab3.menu.Agenda;

/**
 * Laboratório de Programação 2 - Lab 3 (Menu)
 * 
 * @author Henry Filho - 117210389
 *
 */

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda(100);
		String entrada;
		
		while(true) {
			System.out.print("(C)adastrar Contato\n" + 
							 "(L)istar Contatos\n" +
							 "(E)xibir Contato\n" +
							 "(S)air\n\n" +
							 "Opção> ");
		
		
			entrada = sc.nextLine().toLowerCase();
			if(entrada.equals("c")) {
				System.out.print("Posição: ");
				String posicao = sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine().trim();
				System.out.print("Sobrenome: ");
				String sobrenome = sc.nextLine().trim();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine().trim();
				
				try {
					if(agenda.cadastrarContato(posicao, nome, sobrenome, telefone))
						System.out.println("CADASTRO REALIZADO!\n");
					
				}catch(RuntimeException e) {
					
					System.out.println("POSIÇÃO INVÁLIDA!\n");
					
				}
				
				
			}else if(entrada.equals("l")) {
				System.out.println(agenda.listarContatos());
				
			}else if(entrada.equals("e")) {
				System.out.print("Contato> ");
				entrada = sc.nextLine();
				try {
					System.out.println(agenda.exibirContato(entrada));
				}catch(RuntimeException e) {
					System.out.println("POSIÇÃO INVÁLIDA!\n");
				}
				
			}else if(entrada.equals("s")) {
				break;
				
			}else {
				System.out.println("OPÇÃO INVÁLIDA!\n");
			}
			
		}
		
		sc.close();
		
	}
	
}


