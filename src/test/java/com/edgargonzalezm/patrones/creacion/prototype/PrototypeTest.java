package com.edgargonzalezm.patrones.creacion.prototype;

import org.junit.Test;

import com.edgargonzalezm.patrones.creacion.prototype.Animal;
import com.edgargonzalezm.patrones.creacion.prototype.PrototypeFactory;
import com.edgargonzalezm.patrones.creacion.prototype.PrototypeFactory.Type;

public class PrototypeTest {

	@Test
	public void test() {
		try {
			Animal vaca=PrototypeFactory.getInstance(Type.VACA);
			System.out.println(vaca);
			
			Animal oveja=PrototypeFactory.getInstance(Type.OVEJA);
			System.out.println(oveja);
			
			Animal burro=PrototypeFactory.getInstance(Type.BURRO);
			System.out.println(burro);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		assert(true);
	}

}
