package com.edgargonzalezm.patrones.estructura.bridge;

public class CirculoAzul implements PintarApi{

	@Override
	public void pintarCirculo(int radio, int x, int y) {		
		System.out.println("[Circulo Azul ][Radio]"+radio+",[x]"+x+",[Y]"+y);				
	}

}
