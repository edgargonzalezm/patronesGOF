package com.edgargonzalezm.patrones.creacion.abstractfactory;

public class Tren implements Vehiculo {
	private int codigo;

	public int generarCodigo() {
		/** Generamos un codigo aleatorio para el tren */
		int codigoTren = (int) (Math.random() * 9999);
		return codigoTren;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void codigoDeVehiculo() {
		System.out.println("El Codigo del Tren es : " + getCodigo());
	}
}
