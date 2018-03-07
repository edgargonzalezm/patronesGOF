package com.edgargonzalezm.patrones.creacion.factorymethod;

import org.junit.Test;

import com.edgargonzalezm.patrones.creacion.factorymethod.AbstractFactory;
import com.edgargonzalezm.patrones.creacion.factorymethod.Factory;
import com.edgargonzalezm.patrones.creacion.factorymethod.Producto;

public class FactoryMethodTest {

	@Test
	public void test() {
		
		AbstractFactory factory = new Factory();
		Producto producto=factory.factoryMethod();
		producto.accion();
		assert(true);
	}
}
