package com.edgargonzalezm.patrones.comportamiento.visitor;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.visitor.CarroComprasEjecutado;
import com.edgargonzalezm.patrones.comportamiento.visitor.CarroComprasVisitor;
import com.edgargonzalezm.patrones.comportamiento.visitor.Elemento;
import com.edgargonzalezm.patrones.comportamiento.visitor.Libro;
import com.edgargonzalezm.patrones.comportamiento.visitor.Mueble;
import com.edgargonzalezm.patrones.comportamiento.visitor.OtroVisitador;

public class VisitorTest {
	Elemento[] elementos;
	
	@Test
	public void test() {
		elementos=new Elemento[]{
				new Libro(20,"Libro 1"),
				new Mueble(130,"Mueble 1"),
				new Libro(40,"Libro 2"),
				new Libro(600,"Libro 3"),
				new Mueble(320,"Mueble 2"),
				new Libro(520,"Libro 4")
		};
		int total= calcularPrecio(elementos);
		System.out.println("Total de la compra:"+total);
	}

	private int calcularPrecio(Elemento[] items){
		CarroComprasVisitor visitor= new CarroComprasEjecutado();
		CarroComprasVisitor visitor2= new OtroVisitador();
		CarroComprasVisitor visitor3= new CarroComprasEjecutado();
		CarroComprasVisitor visitor4= new OtroVisitador();
		CarroComprasVisitor visitor5= new CarroComprasEjecutado();
		CarroComprasVisitor visitor6= new OtroVisitador();
		int suma=0;
		for (Elemento elemento : items) {
			suma+=elemento.aceptar(visitor);
			suma+=elemento.aceptar(visitor2);
			suma+=elemento.aceptar(visitor3);
			suma+=elemento.aceptar(visitor4);
			elemento.aceptar(visitor5);
			elemento.aceptar(visitor6);
		}
		return suma;
	}
}
