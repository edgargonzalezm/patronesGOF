package com.edgargonzalezm.patrones.comportamiento.observer;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.observer.Biblioteca;
import com.edgargonzalezm.patrones.comportamiento.observer.Libro;

public class ObserverTest {

	@Test
	public void test() {
		Libro libro = new Libro();
		libro.setTitulo("Patrones de diseño");
		libro.setEstado("MALO");
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.devuelveLibro(libro);
	}

}
