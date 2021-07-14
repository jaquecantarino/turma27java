package entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SomaTeste {

	@Test
	public void soma() {
		Soma somador = new Soma();
		assertEquals(30, somador.somar(10, 10));
	}

}
