package com.edgargonzalezm.patrones.comportamiento.observer;

public class Administracion implements Observador {

	@Override
	public void actualizar() {
		System.out.println("Notificar a jefe de biblioteca");		
	}

}
