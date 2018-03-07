package com.edgargonzalezm.patrones.comportamiento.chainofresponsibility;

public class Coronel extends Unidad{

	private String orden;
	public Coronel(String nombre, String orden) {
		super(nombre);
		this.orden=orden;		
	}

	public String orden(){
		return (orden!=null ? orden : super.orden());
	}
	
	public String toString() { 
		return ("Coronel " + super.toString()); 
	}
}
