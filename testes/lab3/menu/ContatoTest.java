package lab3.menu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoTest {
	
	private Contato contato;

	@Before
	public void criarContato() {
		contato = new Contato("Henry", "Filho", "(83) 99999-8888");
	}
	
	@Test(expected=NullPointerException.class)
	public void testNomeNull() {
	    contato = new Contato(null, "Gaudencio", "21010000");
	}
	
	@Test
	public void testGetNome() {
        assertEquals("Henry Filho", contato.getNome());
	}

	@Test
	public void testToString() {
		assertEquals("Henry Filho - (83) 99999-8888", contato.toString());
	}

}
