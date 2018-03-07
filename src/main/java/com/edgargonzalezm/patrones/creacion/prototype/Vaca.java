package com.edgargonzalezm.patrones.creacion.prototype;

public class Vaca implements Animal {
	
	private String tipo = "lechera";
	private String nombre ="vaca 1";
	private int leche = 100;
	
	
	@Override
	public Vaca clone() throws CloneNotSupportedException{
		System.out.println("Clonando vacas");
		return (Vaca)super.clone();
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


	public int getLeche() {
		return leche;
	}


	public void setLeche(int leche) {
		this.leche = leche;
	}


	@Override
	public String toString() {
		return "Vaca [tipo=" + tipo + ", nombre=" + nombre + ", leche=" + leche
				+ "]";
	}
	
	
}
