package com.edgargonzalezm.patrones.comportamiento.memento;

public class Regular {
	
	private Memento memento;
	
	private String nombre;
	private String descripcion;
	private int cantidad;
			
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void makeBackup(){
		memento= new Memento(nombre, descripcion, cantidad);
	}
	
	public void recoverBackup(){
		nombre= memento.recoveryNombre();
		descripcion= memento.recoveryDescripcion();
		cantidad= memento.recoveryCantidad();
	}
	
	@Override
	public String toString() {
		return "Regular [nombre=" + nombre + ", descripcion=" + descripcion
				+ ", cantidad=" + cantidad + "]";
	}
	
	/**
	 * Clase de que almacena backup
	 * @author Admin
	 *
	 */
	private class Memento{
		private String nombre;
		private String descripcion;
		private int cantidad;
		
		public Memento(String nombre, String descripcion, int cantidad)
		{
			this.nombre=nombre;
			this.descripcion=descripcion;
			this.cantidad=cantidad;
		}
		
		public String recoveryNombre(){
			return this.nombre;
		}
		public String recoveryDescripcion(){
			return this.descripcion;
		}
		public int recoveryCantidad(){
			return this.cantidad;
		}
	}
}
