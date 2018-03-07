package com.edgargonzalezm.patrones.estructura.bridge;

public class CirculoRojo implements PintarApi{

	@Override
	public void pintarCirculo(int radio, int x, int y) {		
		System.out.println("[Circulo Rojo ][Radio]"+radio+",[x]"+x+",[Y]"+y);				
	}

}
