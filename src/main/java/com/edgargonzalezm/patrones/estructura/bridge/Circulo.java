package com.edgargonzalezm.patrones.estructura.bridge;

public class Circulo extends Figura{

	private int x,y,radio; 
	
	protected Circulo(int radio, int x, int y,PintarApi pintarApi) {
		super(pintarApi);
		this.radio=radio;
		this.x=x;
		this.y=y;
	}

	@Override
	public void pintar() {
		pintarAPI.pintarCirculo(radio, x, y);
		
	}

}
