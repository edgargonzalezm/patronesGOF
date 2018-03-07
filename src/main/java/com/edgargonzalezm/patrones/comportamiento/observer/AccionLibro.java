package com.edgargonzalezm.patrones.comportamiento.observer;

public interface AccionLibro {

	public void agregar(Observador libro);
	public void eliminar(Observador libro);
	public void notificarObservadores();
}
