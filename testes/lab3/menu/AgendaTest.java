package lab3.menu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgendaTest {
	
	Agenda agenda;
	
	@Before
	public void criarAgenda() {
		agenda = new Agenda(100);
	}

	@Test
	public void testCadastrarContatoLiminiteUm() {
		assertEquals(agenda.cadastrarContato("1", "Henry", "Filho", "(83) 99999-8888"), true);
		
	}
	
	@Test
	public void testCadastrarContatoLiminiteCem() {
		assertEquals(agenda.cadastrarContato("100", "Deborah", "Gyovanna", "(83) 99999-7777"), true);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testCadastrarContatoLiminiteZero() {
		assertEquals(agenda.cadastrarContato("0", "Eduardo", "Henrique", "(83) 99999-6666"), true);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testCadastrarContatoLiminitCentoeUm() {
		assertEquals(agenda.cadastrarContato("101", "Donald", "Trump", "(83) 99999-5555"), true);
		
	}
	
	@Test
	public void testListarContatosVazia() {
		assertEquals(agenda.listarContatos(), "");
	}
	
	@Test
	public void testListarContatos() {
		agenda.cadastrarContato("1", "Henry", "Filho", "(83) 99999-8888");
		agenda.cadastrarContato("2", "Deborah", "Gyovanna", "(83) 99999-7777");
		agenda.cadastrarContato("3", "Eduardo", "Henrique", "(83) 99999-6666");
		agenda.cadastrarContato("4", "Donald", "Trump", "(83) 99999-5555");
		
		assertEquals(agenda.listarContatos(), "1 - Henry Filho\n"
											+ "2 - Deborah Gyovanna\n"
											+ "3 - Eduardo Henrique\n"
											+ "4 - Donald Trump\n");
	}

	@Test
	public void testExibirContatoValido() {
		agenda.cadastrarContato("1", "Henry", "Filho", "(83) 99999-8888");
		
		assertEquals(agenda.exibirContato("1"), "Henry Filho - (83) 99999-8888\n");
	}
	
	@Test(expected=RuntimeException.class)
	public void testExibirContatoInvalido() {
		assertEquals(agenda.exibirContato("1"), "Henry Filho - (83) 99999-8888\n");
	}
	
}
