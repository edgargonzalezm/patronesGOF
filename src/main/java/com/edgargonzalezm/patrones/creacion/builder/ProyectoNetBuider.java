package com.edgargonzalezm.patrones.creacion.builder;

public class ProyectoNetBuider extends ProyectoBuilder{

	@Override
	public void buildNombre() {
		proyecto.setNombre("Proyecto .net");
		
	}

	@Override
	public void buildLenguaje() {
		proyecto.setLenguaje(".net");
		
	}

}
