package com.edgargonzalezm.patrones.estructura.composite;

public class ComponenteHoja extends Componente {

	public ComponenteHoja(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregar(Componente c) {
		System.out.println("no se puede agregar mas");
		
	}

	@Override
	public void eliminar(Componente c) {
		System.out.println("no se puede eliminar");
		
	}

	@Override
	public void mostrar(int profunidad) {
		System.out.println("-"+nombre);
		
	}

}
