package com.edgargonzalezm.patrones.comportamiento.memento;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.memento.Regular;

public class RegularTest {

	@Test
	public void test() {
		Regular regular = new Regular();
		regular.setNombre("Original");
		regular.setDescripcion("Original descripcion");
		regular.setCantidad(100);		
		System.out.println("Asignación de primaria: "+regular.toString());
		
		regular.makeBackup();
		
		regular.setNombre("Modificado");
		regular.setDescripcion("Modificado descripcion");
		regular.setCantidad(2300);
		System.out.println("Modificación : "+regular.toString());
		
		regular.recoverBackup();
		System.out.println("Recuperación de nombre original:"+regular.toString());
		assert(true);
	}

}
