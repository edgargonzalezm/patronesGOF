package com.edgargonzalezm.patrones.estructura.decorator;

public abstract class FiguraDecorator implements Figura{
	protected Figura figura;
	
	public FiguraDecorator(Figura figura){
		this.figura=figura;
	}
	
	public void dibujar(){
		figura.dibujar();
	}
}
