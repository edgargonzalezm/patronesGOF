package com.edgargonzalezm.patrones.estructura.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FiguraFactory {
	private static final Map<String,Figura> figuraMap= new HashMap<String,Figura>();
	
	public static Figura getCirculo(String color){
		Figura circulo = figuraMap.get(color);
		
		if(circulo==null){
			circulo= new Circulo(color);
			figuraMap.put(color, circulo);
			System.out.println("Creando Circulo de color "+color);
		}
		return circulo;
	}
}
