package com.edgargonzalezm.patrones.comportamiento.state;

public class EstadoEncendido implements Estado{
	@Override
	public void doAction(Context contexto) {
		System.out.println("Setenado estado Encendido en contexto");
		contexto.setEstado(this);		
	}
	
	public String toString(){
	      return "Estado: Encendido";
	   }

}
