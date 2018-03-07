package com.edgargonzalezm.patrones.creacion.prototype;

public class Oveja implements Animal{
	
	private String tipo= "productora de lana";
	private String nombre = "oveja 1";
	private int produccion= 10;
	
	@Override
	public Oveja clone() throws CloneNotSupportedException{
		System.out.println("Clonando ovejas");
		return (Oveja)super.clone();
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

	public int getProduccion() {
		return produccion;
	}

	public void setProduccion(int produccion) {
		this.produccion = produccion;
	}

	@Override
	public String toString() {
		return "Oveja [tipo=" + tipo + ", nombre=" + nombre + ", produccion="
				+ produccion + "]";
	}
	
	
}
