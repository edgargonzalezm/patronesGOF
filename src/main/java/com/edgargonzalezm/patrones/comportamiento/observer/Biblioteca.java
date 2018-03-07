package com.edgargonzalezm.patrones.comportamiento.observer;

public class Biblioteca {

	public void devuelveLibro(Libro libro){
		
		if("MALO".equals( libro.getEstado())){
			AlarmaLibro alarma= new AlarmaLibro();
			alarma.agregar(new Administracion());
			alarma.agregar(new DepAdquisicion());
			alarma.agregar(new Inventario());
			alarma.notificarObservadores();
		}
	}
}
