package com.edgargonzalezm.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmaLibro implements AccionLibro{
	private static List<Observador> observadores= new ArrayList<Observador>();
	@Override
	public void agregar(Observador libro) {
		observadores.add(libro);
		
	}

	@Override
	public void eliminar(Observador libro) {
		observadores.remove(libro);
		
	}

	@Override
	public void notificarObservadores() {
		for (Observador observador : observadores) {
			observador.actualizar();
		}
		
	}

}
