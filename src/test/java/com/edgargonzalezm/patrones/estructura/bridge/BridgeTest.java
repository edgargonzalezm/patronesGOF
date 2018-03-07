package com.edgargonzalezm.patrones.estructura.bridge;

import org.junit.Test;

import com.edgargonzalezm.patrones.estructura.bridge.Circulo;
import com.edgargonzalezm.patrones.estructura.bridge.CirculoAzul;
import com.edgargonzalezm.patrones.estructura.bridge.CirculoRojo;
import com.edgargonzalezm.patrones.estructura.bridge.Figura;

public class BridgeTest {

	@Test
	public void test() {
		Figura circuloRojo= new Circulo(140,1330,1,new CirculoRojo());
		Figura circuloAzul= new Circulo(20,101,120,new CirculoAzul());
		circuloRojo.pintar();
		circuloAzul.pintar();
	}

}
