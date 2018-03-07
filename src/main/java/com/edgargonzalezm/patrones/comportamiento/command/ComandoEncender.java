package com.edgargonzalezm.patrones.comportamiento.command;

public class ComandoEncender implements Command {
	 
	private Light theLight;
	
	public ComandoEncender(Light light) {
        this.theLight=light;
   }
	
	@Override
	public void execute() {
		this.theLight.turnOn();
		
	}

}
