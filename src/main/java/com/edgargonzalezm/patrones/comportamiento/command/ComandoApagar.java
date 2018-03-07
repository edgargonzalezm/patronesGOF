package com.edgargonzalezm.patrones.comportamiento.command;

public class ComandoApagar implements Command {

	
	private Light theLight;
	
	
	 public ComandoApagar(Light light) {
	        this.theLight=light;
	   }
	 
	@Override
	public void execute() {
		this.theLight.turnOff();
		
	}

}
