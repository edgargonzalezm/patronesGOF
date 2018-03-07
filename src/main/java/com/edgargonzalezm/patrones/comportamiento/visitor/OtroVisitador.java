package com.edgargonzalezm.patrones.comportamiento.visitor;

public class OtroVisitador extends CarroComprasVisitorImp{

	@Override
	public int visit(Libro libro) {
		System.out.println("Otro visitador en libro");
		return 0;
	}

	@Override
	public int visit(Mueble mueble) {
		mueble.getPrecio();
		System.out.println("Otro Visiatador Mueble");
		return 0;
	}

}
