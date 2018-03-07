package com.edgargonzalezm.patrones.estructura.flyweight;

import org.junit.Test;

import com.edgargonzalezm.patrones.estructura.flyweight.Circulo;
import com.edgargonzalezm.patrones.estructura.flyweight.FiguraFactory;

public class FlywightTest {
	private static final String colores[]={"ROJO","AZUL","BLANCO","AMARILLO","VERDE"};
	
	@Test
	public void test() {
		for (int i = 0; i < 20; i++) {
			Circulo circulo = (Circulo)FiguraFactory.getCirculo(getColor());
			circulo.setCoordenadaX(getRandom());
			circulo.setCoordenadaY(getRandom());
			circulo.setRadio(getRandom());
			circulo.draw();
		}
	}

	private String getColor(){
		return colores[(int)(Math.random()*colores.length)];
	}
	
	private static int getRandom() {
		return (int)(Math.random()*100 );
	}
}
