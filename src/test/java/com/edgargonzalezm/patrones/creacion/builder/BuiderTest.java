package com.edgargonzalezm.patrones.creacion.builder;

import org.junit.Test;

import com.edgargonzalezm.patrones.creacion.builder.AreaProyectos;
import com.edgargonzalezm.patrones.creacion.builder.ProyectoBuilder;
import com.edgargonzalezm.patrones.creacion.builder.ProyectoJavaBuilder;
import com.edgargonzalezm.patrones.creacion.builder.ProyectoNetBuider;

public class BuiderTest {
	@Test
	public void test1() {
	
		AreaProyectos area= new AreaProyectos();
		
		ProyectoBuilder java= new ProyectoJavaBuilder();
		ProyectoBuilder net= new ProyectoNetBuider();
		
		area.setProyectoBuider(java);
		area.generarProyecto();
		
		
		System.out.println(area.getProyecto().getNombre());
		System.out.println(area.getProyecto().getLenguaje());
		
		
		area.setProyectoBuider(net);
		area.generarProyecto();
		
		System.out.println(area.getProyecto().getNombre());
		System.out.println(area.getProyecto().getLenguaje());
	
		assert(true);
	}
}
