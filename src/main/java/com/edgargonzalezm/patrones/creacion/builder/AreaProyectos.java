package com.edgargonzalezm.patrones.creacion.builder;

public class AreaProyectos {

	private ProyectoBuilder proyectoBuider;

	public Proyecto getProyecto() {
		return proyectoBuider.getProyecto();
	}

	public void setProyectoBuider(ProyectoBuilder proyectoBuider) {
		this.proyectoBuider = proyectoBuider;
	}
	
	public void generarProyecto(){
		proyectoBuider.crarProyecto();
		proyectoBuider.buildNombre();
		proyectoBuider.buildLenguaje();
	}
	
}
