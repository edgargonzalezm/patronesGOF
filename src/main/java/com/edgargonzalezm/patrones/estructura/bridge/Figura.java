package com.edgargonzalezm.patrones.estructura.bridge;

public abstract class Figura {
	protected PintarApi pintarAPI;
	
	protected Figura(PintarApi pintarApi){
		this.pintarAPI=pintarApi;
	}
	
	public abstract void pintar();
}
