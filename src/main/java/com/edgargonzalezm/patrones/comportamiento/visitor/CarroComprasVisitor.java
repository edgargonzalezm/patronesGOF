package com.edgargonzalezm.patrones.comportamiento.visitor;

public interface CarroComprasVisitor {

	int visit(Libro libro);
	int visit(Mueble mueble);
}
