package com.edgargonzalezm.patrones.creacion.factorymethod;

/**
 * Clase Abstracta de la cual genera nuevas fabricas
 * @author edgar.gonzalez
 *
 */
public abstract class AbstractFactory {

	/**
	 * Declaración de factoryMethod
	 * @return
	 */
	public abstract Producto factoryMethod();
}
