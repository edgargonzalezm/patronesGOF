package com.edgargonzalezm.patrones.comportamiento.state;

public class EstadoApagado implements Estado{

	@Override
	public void doAction(Context contexto) {
		System.out.println("Setenado estado Apagado en contexto");
		contexto.setEstado(this);		
	}
	
	public String toString(){
	      return "Estado: Apagado";
	   }

}
