package com.edgargonzalezm.patrones.comportamiento.chainofresponsibility;

public class Soldado extends Unidad{

	public Soldado(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	 public String toString() { 
		 return ("Soldado " + super.toString()); 
	}

}
