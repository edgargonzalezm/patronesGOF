package com.edgargonzalezm.patrones.comportamiento.visitor;

public class Mueble implements Elemento{

	private int precio;
	private String tipo;
	
	
	@Override
	public int aceptar(CarroComprasVisitor visitor) {
		return visitor.visit(this);
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getTipo() {
		return tipo;
	}


	public Mueble(int precio, String tipo) {
		super();
		this.precio = precio;
		this.tipo = tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Mueble [precio=" + precio + ", tipo=" + tipo + "]";
	}

}
