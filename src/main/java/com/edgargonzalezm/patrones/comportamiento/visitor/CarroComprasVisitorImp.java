package com.edgargonzalezm.patrones.comportamiento.visitor;

public abstract class CarroComprasVisitorImp implements CarroComprasVisitor{

	@Override
	public int visit(Libro libro) {
		System.out.println("Procesando en Carro de compras:"+libro);
		return libro.getPrecio();
	}

	@Override
	public int visit(Mueble mueble) {
		System.out.println("Procesando en Carro de compras:"+mueble);
		return mueble.getPrecio();
	}

}
