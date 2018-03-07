package com.edgargonzalezm.patrones.creacion.abstractfactory;

import org.junit.Test;

import com.edgargonzalezm.patrones.creacion.abstractfactory.FabricaBuses;
import com.edgargonzalezm.patrones.creacion.abstractfactory.FabricaDeVehiculos;
import com.edgargonzalezm.patrones.creacion.abstractfactory.FabricaTaxis;
import com.edgargonzalezm.patrones.creacion.abstractfactory.FabricaTren;

public class AbstractFactoryTest {
	@Test
	public void test1() {	
		
		FabricaTaxis taxi = new FabricaTaxis();
		FabricaBuses buses = new FabricaBuses();
		FabricaTren tren = new FabricaTren();
		
		FabricaDeVehiculos.crearFabricaDeVehiculo(taxi);
		FabricaDeVehiculos.crearFabricaDeVehiculo(buses);
		FabricaDeVehiculos.crearFabricaDeVehiculo(tren);
	}

}
