package com.edgargonzalezm.patrones.comportamiento.state;

public class Context {
	public Context() {
		
		this.estado = null;
	}

	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
