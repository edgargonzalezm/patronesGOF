package com.edgargonzalezm.patrones.comportamiento.observer;

public class Libro {

	private String titulo;
	private String estado;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", estado=" + estado + "]";
	}
}
