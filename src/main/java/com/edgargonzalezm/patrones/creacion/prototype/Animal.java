package com.edgargonzalezm.patrones.creacion.prototype;

public interface Animal extends Cloneable{
	public Animal clone() throws CloneNotSupportedException;
		
}
