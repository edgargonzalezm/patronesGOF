package com.edgargonzalezm.patrones.creacion.builder;

public class ProyectoJavaBuilder extends ProyectoBuilder{

	@Override
	public void buildNombre() {
		proyecto.setNombre("Proyecto 1");
		
	}

	@Override
	public void buildLenguaje() {
		proyecto.setLenguaje("Java");
		
	}

}
