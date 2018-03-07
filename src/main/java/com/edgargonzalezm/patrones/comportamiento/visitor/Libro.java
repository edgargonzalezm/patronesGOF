package com.edgargonzalezm.patrones.comportamiento.visitor;

public class Libro implements Elemento{

	private int precio;
	private String titulo;
	
	@Override
	public int aceptar(CarroComprasVisitor visitor) {	
		return visitor.visit(this);
	}

	public Libro(int precio, String titulo) {
		super();
		this.precio = precio;
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [precio=" + precio + ", titulo=" + titulo + "]";
	}

}
