package com.edgargonzalezm.patrones.comportamiento.chainofresponsibility;

public abstract class Unidad {
	private Unidad mando;
    private String nombre;
    
    public Unidad(String nombre){
    	this.mando=null;
    	this.nombre=nombre;
    }
    
    public String toString(){
    	return nombre;
    }
    
    public void establecerMando(Unidad mando){
    	this.mando=mando;
    }
    
    public String orden(){
    	return (mando!=null ? nombre+":"+mando.orden() :  nombre+":"+"Sin Orden");
    }
}
