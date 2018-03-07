package com.edgargonzalezm.patrones.estructura.facade;

public class PersonaFacade {
	private Persona adulto;
	private Persona joven;
	private Persona bebe;
	
	public PersonaFacade (){
		adulto= new Adulto();
		joven=new Joven();
		bebe= new Bebe();		
	}
	
	public void caminarAdulto(){
		adulto.caminar();
	}
	
	public void caminarJoven(){
		joven.caminar();
	}
	
	public void caminarBebe(){
		bebe.caminar();
	}
}
