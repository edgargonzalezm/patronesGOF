package com.edgargonzalezm.patrones.creacion.abstractfactory;

public class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory) {
		
		Vehiculo objetoVehiculo = factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}
	
}
