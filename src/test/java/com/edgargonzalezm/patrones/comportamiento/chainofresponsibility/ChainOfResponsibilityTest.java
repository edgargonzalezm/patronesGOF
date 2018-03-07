package com.edgargonzalezm.patrones.comportamiento.chainofresponsibility;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.chainofresponsibility.Coronel;
import com.edgargonzalezm.patrones.comportamiento.chainofresponsibility.Soldado;
import com.edgargonzalezm.patrones.comportamiento.chainofresponsibility.Unidad;

public class ChainOfResponsibilityTest {

	@Test
	public void test(){
		
	      Unidad truman = new Coronel("Truman", "Tomar posición enemiga");
	      Unidad ryan   = new Soldado("Ryan");
	      Unidad rambo  = new Soldado("Rambo");

	      System.out.println(rambo.orden());    // rambo ->

	      rambo.establecerMando(truman);
	      System.out.println(rambo.orden());    // rambo -> truman

	      ryan.establecerMando(rambo);
	      System.out.println(ryan.orden());     // ryan -> rambo -> truman
		assert(true);
	}
}
