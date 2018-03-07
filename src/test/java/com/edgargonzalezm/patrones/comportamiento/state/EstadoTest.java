package com.edgargonzalezm.patrones.comportamiento.state;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.state.Context;
import com.edgargonzalezm.patrones.comportamiento.state.EstadoApagado;
import com.edgargonzalezm.patrones.comportamiento.state.EstadoEncendido;

public class EstadoTest {

	@Test
	public void test() {
		Context contexto = new Context();
		EstadoEncendido encendido=new EstadoEncendido();
		encendido.doAction(contexto);
		System.out.println(contexto.getEstado().toString());
		
		EstadoApagado apagado= new EstadoApagado();
		apagado.doAction(contexto);
		
		System.out.println(contexto.getEstado().toString());
	}

}
