package com.edgargonzalezm.patrones.estructura.composite;

public abstract class Componente {
	protected String nombre;
	
	public Componente (String nombre){
		this.nombre=nombre;
	}
	
	public abstract void agregar(Componente c);
	public abstract void eliminar(Componente c);
	public abstract void mostrar(int profunidad);
}
