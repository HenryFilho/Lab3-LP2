package lab3.menu;

/**
 * Laboratório de Programação 2 - Lab 3 (Contato)
 * 
 * @author Henry Filho - 117210389
 *
 */

public class Contato {
	
	/**
	 * Nome do contato.
	 */
	private String nome;
	/**
	 * Sobrenome do contato.
	 */
	private String sobrenome;
	/**
	 * Telefone do contato.
	 */
	private String telefone;
	
	/**
	 * 
	 * @param nome
	 * 		Nome do contato.
	 * @param sobrenome
	 * 		Sobrenome do contato.
	 * @param telefone
	 * 		Telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if(nome == null || sobrenome == null || telefone == null)
			throw new NullPointerException();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * Getter do nome e sobrenome do contato.
	 * @return
	 * 		nome + " " + sobrenome
	 */
	public String getNome() {
		return nome + " " + sobrenome;
	}
	
	@Override
	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}
}
