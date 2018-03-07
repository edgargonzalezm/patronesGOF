package com.edgargonzalezm.patrones.creacion.factorymethod;

/**
 * Facbrica de producto pantalla
 * @author edgar.gonzalez
 *
 */
public class Factory extends AbstractFactory{

	@Override
	public Producto factoryMethod() {
		return new ProductoPantalla();
	}

}
