package com.edgargonzalezm.patrones.creacion.builder;

abstract class ProyectoBuilder {
	protected Proyecto proyecto;
	
	public Proyecto getProyecto(){
		return proyecto;
	}
	
	public void crarProyecto(){
		this.proyecto = new Proyecto();
	}
	
	public abstract void buildNombre();
	
	public abstract void buildLenguaje();
	
}
