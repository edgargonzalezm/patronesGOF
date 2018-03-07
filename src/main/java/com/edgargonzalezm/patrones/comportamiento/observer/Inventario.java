package com.edgargonzalezm.patrones.comportamiento.observer;

public class Inventario implements Observador {

	@Override
	public void actualizar() {
		System.out.println("Descontar del stock");		
	}

}
