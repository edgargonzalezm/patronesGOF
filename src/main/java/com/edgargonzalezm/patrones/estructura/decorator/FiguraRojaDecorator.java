package com.edgargonzalezm.patrones.estructura.decorator;

public class FiguraRojaDecorator extends FiguraDecorator {
	
	public FiguraRojaDecorator(Figura figura){
		super(figura);
	}
	
	@Override
	public void dibujar(){
		figura.dibujar();
		setBorde(figura);
	}
	
	public void setBorde(Figura figura){
		System.out.println("color rojo");
	}
}
