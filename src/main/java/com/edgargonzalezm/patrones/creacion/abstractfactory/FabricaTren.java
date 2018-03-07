package com.edgargonzalezm.patrones.creacion.abstractfactory;

public class FabricaTren implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Tren tren = new Tren();
		tren.setCodigo(tren.generarCodigo());
		System.out.println("Se ha creado un nuevo Objeto tren:"+tren.getCodigo()); 
		return tren;
	}

}
