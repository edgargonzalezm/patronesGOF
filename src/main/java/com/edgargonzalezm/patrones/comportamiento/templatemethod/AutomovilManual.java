package com.edgargonzalezm.patrones.comportamiento.templatemethod;

public class AutomovilManual extends Automovil{

	@Override
	protected void cambiarMarcha() {
		System.out.println("Cambiando marcha manualmente");
		
	}

}
