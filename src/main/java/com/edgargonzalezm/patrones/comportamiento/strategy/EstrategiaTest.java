package com.edgargonzalezm.patrones.comportamiento.strategy;

import org.junit.Test;

public class EstrategiaTest {

	@Test
	public void test() {
		Estrategia estrategiaInicial= new EstrategiaAImp();
		Contexto ctx= new Contexto(estrategiaInicial);		
		ctx.ejecucion();
		
		Estrategia estrategia2= new EstrategiaBImp();
		ctx.setEst(estrategia2);		
		ctx.ejecucion();
		
		ctx.setEst(estrategiaInicial);		
		ctx.ejecucion();	
	}

}
