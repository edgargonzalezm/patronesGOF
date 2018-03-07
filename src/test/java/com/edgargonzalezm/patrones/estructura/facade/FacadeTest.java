package com.edgargonzalezm.patrones.estructura.facade;

import org.junit.Test;

import com.edgargonzalezm.patrones.estructura.facade.PersonaFacade;

public class FacadeTest {

	@Test
	public void test1() {
		PersonaFacade facade= new PersonaFacade();
		facade.caminarAdulto();
		facade.caminarJoven();
		facade.caminarBebe();
		assert(true);
	}
}
