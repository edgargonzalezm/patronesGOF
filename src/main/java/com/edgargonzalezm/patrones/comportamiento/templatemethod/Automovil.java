package com.edgargonzalezm.patrones.comportamiento.templatemethod;

public abstract class Automovil {
	private int velocidad;
	
	public final void desplazar(){
		acelerar();
		cambiarMarcha();
		frenar();
	}
	
	private void acelerar(){
		velocidad++;
		System.out.println("Acelerando "+velocidad);
	}
	private void frenar(){
		velocidad--;
		System.out.println("Frenando "+velocidad);
	}
	
	protected abstract void cambiarMarcha();
	
	public void verVelocidad(){
		System.out.println("Velocidad:"+velocidad);
	}
}
