package com.edgargonzalezm.patrones.creacion.factorymethod;

/**
 * Producto pantalla. 
 * Clase concreta la cual contiene todos los 
 * metodos y propiedades del producto
 * @author edgar.gonzalez
 *
 */
public class ProductoPantalla implements Producto {

	@Override
	public void accion() {
		System.out.println("Implementación de producto de tipo pantalla");
		
	}

}
