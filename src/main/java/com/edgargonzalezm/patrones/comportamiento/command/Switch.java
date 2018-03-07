package com.edgargonzalezm.patrones.comportamiento.command;

public class Switch {
	private Command encenderCommand;
    private Command apagarCommand;

    public Switch(Command flipUpCmd, Command flipDownCmd) {
         this.encenderCommand = flipUpCmd;
         this.apagarCommand = flipDownCmd;
    }

    public void encender() {
    	encenderCommand.execute();
    }

    public void apagar() {
    	apagarCommand.execute();
    }
}
