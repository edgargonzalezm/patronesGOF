package com.edgargonzalezm.patrones.estructura.composite;

import org.junit.Test;

import com.edgargonzalezm.patrones.estructura.composite.ComponenteHoja;
import com.edgargonzalezm.patrones.estructura.composite.ComponenteRaiz;

public class CompositeTest {

	@Test
	public void test() {
		 ComponenteRaiz raiz= new ComponenteRaiz("Root");
		 raiz.agregar(new ComponenteHoja("Hoja 1"));
		 raiz.agregar(new ComponenteHoja("Hoja 2"));
		 raiz.agregar(new ComponenteHoja("Hoja 3"));
		 raiz.agregar(new ComponenteHoja("Hoja 4"));
		 raiz.agregar(new ComponenteHoja("Hoja 5"));
		
		 ComponenteRaiz componente1 = new ComponenteRaiz("Nivel 1");
		 raiz.agregar(componente1);
		 componente1.agregar(new ComponenteHoja("Hoja 6"));
		 componente1.agregar(new ComponenteHoja("Hoja 7"));
		 
		 ComponenteRaiz componente2 = new ComponenteRaiz("Nivel 2");
		 componente1.agregar(componente2);
		 componente2.agregar(new ComponenteHoja("Hoja 8"));
		 componente2.agregar(new ComponenteHoja("Hoja 9"));
		 ComponenteHoja hoja= new ComponenteHoja("Hoja 9");
		 raiz.agregar(hoja);
		 raiz.eliminar(hoja);
		 raiz.mostrar(1);
	}

}
