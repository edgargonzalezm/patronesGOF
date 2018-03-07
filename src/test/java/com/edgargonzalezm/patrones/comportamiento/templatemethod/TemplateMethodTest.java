package com.edgargonzalezm.patrones.comportamiento.templatemethod;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.templatemethod.Automovil;
import com.edgargonzalezm.patrones.comportamiento.templatemethod.AutomovilAutomatico;
import com.edgargonzalezm.patrones.comportamiento.templatemethod.AutomovilManual;

public class TemplateMethodTest {
	
	@Test
	public void test(){
		Automovil autoManual=new AutomovilManual();
		Automovil autoAutomatico=new AutomovilAutomatico();
		
		autoManual.desplazar();
		autoAutomatico.desplazar();
		assert(true);
	}

}
