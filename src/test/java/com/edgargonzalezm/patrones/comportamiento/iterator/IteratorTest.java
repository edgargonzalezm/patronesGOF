package com.edgargonzalezm.patrones.comportamiento.iterator;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.iterator.Iterador;
import com.edgargonzalezm.patrones.comportamiento.iterator.Repositorio;

public class IteratorTest {

	@Test
	public void test(){
		Repositorio repositorio = new Repositorio();
		
		for(Iterador iter= repositorio.getIterator();iter.hasNext();){
			String nombre=(String)iter.next();
			System.out.println("Nombre "+nombre);
		}
		
		assert(true);
	}
}
