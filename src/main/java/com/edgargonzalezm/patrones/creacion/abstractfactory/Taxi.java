package com.edgargonzalezm.patrones.creacion.abstractfactory;


public class Taxi implements Vehiculo{
	 private int codigo;
	 public int generarCodigo()
	 {
	  /**Generamos un codigo aleatorio para el taxi*/
	  int codigoTaxi=(int) (Math.random()*9999);
	  return codigoTaxi;
	 }
	 public int getCodigo() {
	  return codigo;
	 }
	 public void setCodigo(int codigo) {
	  this.codigo = codigo;
	 }
	 @Override
	 public void codigoDeVehiculo() {
		 System.out.println("El Codigo del Taxi es : "+getCodigo());	  
	 }

}
