package com.edgargonzalezm.patrones.estructura.decorator;

import org.junit.Test;

import com.edgargonzalezm.patrones.estructura.decorator.Circulo;
import com.edgargonzalezm.patrones.estructura.decorator.Figura;
import com.edgargonzalezm.patrones.estructura.decorator.FiguraRojaDecorator;
import com.edgargonzalezm.patrones.estructura.decorator.Rectangulo;

public class DecoratorTest {
	@Test
	public void test1() {
		Figura circulo = new Circulo();
		circulo.dibujar();
		
		Figura circuloRojo= new FiguraRojaDecorator(new Circulo());
		circuloRojo.dibujar();
		
		Figura rectanguloRojo= new FiguraRojaDecorator(new Rectangulo());
		rectanguloRojo.dibujar();
		
		assert(true);
	}
}
