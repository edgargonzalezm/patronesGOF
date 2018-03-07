package com.edgargonzalezm.patrones.estructura.composite;

import java.util.ArrayList;
import java.util.List;

public class ComponenteRaiz extends Componente{

	private List<Componente>hijo= new ArrayList<Componente>();
	public ComponenteRaiz(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregar(Componente c) {
		hijo.add(c);
		
	}

	@Override
	public void eliminar(Componente c) {
		hijo.remove(c);
		
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println(nombre + " nivel: " + profundidad);
		for (Componente componente : hijo) {
			componente.mostrar(profundidad+1);
		}		
	}

}
