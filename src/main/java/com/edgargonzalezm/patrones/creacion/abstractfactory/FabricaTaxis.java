package com.edgargonzalezm.patrones.creacion.abstractfactory;


public class FabricaTaxis implements VehiculoDeTransporte{
	 @Override
	 public Vehiculo crearVehiculo() {
	  Taxi miTaxi=new Taxi();
	  miTaxi.setCodigo(miTaxi.generarCodigo());
	  System.out.println("Se ha creado un nuevo Objeto Taxi");  
	  return miTaxi;
	 }

}
