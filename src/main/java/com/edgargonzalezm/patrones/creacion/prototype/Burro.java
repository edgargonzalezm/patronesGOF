package com.edgargonzalezm.patrones.creacion.prototype;

public class Burro implements Animal{
	
	private String tipo ="carga";
	private String nombre = "burro 1";
	private int carga = 80;
	
	@Override
	public Burro clone() throws CloneNotSupportedException{
		System.out.println("Clonando burros");
		return (Burro)super.clone();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Burro [tipo=" + tipo + ", nombre=" + nombre + ", carga="
				+ carga + "]";
	}
	
	
}
