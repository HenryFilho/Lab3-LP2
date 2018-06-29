package lab3.menu;

/**
 * Laboratório de Programação 2 - Lab 3 (Agenda)
 * 
 * @author Henry Filho - 117210389
 *
 */

public class Agenda {
	
	/**
	 * Array de contatos.
	 */
	private Contato[] agenda;
	
	/**
	 * 
	 * @param i
	 * 		Quantia de contatos possíveis.
	 */
	public Agenda(int i) {
		this.agenda = new Contato[i];
	}
	
	/**
	 * Cadastra um contato na agenda.
	 * 
	 * @param i
	 * 		Posição do contato na agenda.
	 * @param nome
	 * 		Nome do contato.
	 * @param sobrenome
	 * 		Sobrenome do contato.
	 * @param telefone
	 * 		Telefone do contato.
	 * @return
	 * 		Retorna true caso o contato tenha sido cadastrado com sucesso.
	 */
	public boolean cadastrarContato(String i, String nome, String sobrenome, String telefone) {
		
		try {
			int posicao = Integer.parseInt(i);
			if(nome.equals("") || sobrenome.equals("") || telefone.equals(""))
				throw new IllegalArgumentException();
			
			if(0 < posicao && posicao < agenda.length+1) {
				agenda[posicao-1] = new Contato(nome, sobrenome, telefone);
				return true;
			}
			
			throw new RuntimeException();
			
		}catch(NumberFormatException e) {
			throw new RuntimeException();
		}
		
	}
	
	/**
	 * Lista os contatos existentes.
	 * 
	 * @return
	 * 		Posição + " - " + contato.getNome()
	 */
	public String listarContatos() {
		
		String retorno = "";
		for(int i = 0; i < agenda.length; i++) {
			if(agenda[i] != null)
				retorno += (i+1) + " - " + agenda[i].getNome() + System.lineSeparator();
		}
		
		return retorno;
		
	}
	
	/**
	 * Exibe um contato expecífico.
	 * 
	 * @param i
	 * 		Posição do contato.
	 * @return
	 * 		contato.toString()
	 */
	public String exibirContato(String i) {
		
		int posicao = Integer.parseInt(i);
		
		if(0 < posicao && posicao < agenda.length-1 && agenda[posicao-1] != null)
			return agenda[posicao-1].toString() + System.lineSeparator();
			
		throw new RuntimeException();
		
	}

}
