package com.edgargonzalezm.patrones.comportamiento.strategy;

public class Contexto {
	Estrategia est;

	public Contexto(Estrategia est){
		this.est = est;
	}
	
	public void setEst(Estrategia est) {
		this.est = est;
	}
	
	public void ejecucion(){
		this.est.comportamiento();
	}
}
	