package com.edgargonzalezm.patrones.comportamiento.command;

import org.junit.Test;

import com.edgargonzalezm.patrones.comportamiento.command.ComandoApagar;
import com.edgargonzalezm.patrones.comportamiento.command.ComandoEncender;
import com.edgargonzalezm.patrones.comportamiento.command.Command;
import com.edgargonzalezm.patrones.comportamiento.command.Light;
import com.edgargonzalezm.patrones.comportamiento.command.Switch;

public class PressSwitch {
	
	@Test
	 public  void test(){
	       
	      Light lamp = new Light();
	      Command switchUp = new ComandoEncender(lamp);
	      Command switchDown = new ComandoApagar(lamp);
	
	      Switch mySwitch = new Switch(switchUp, switchDown);
          String opcion ="OFF";
	      switch (opcion) {
	         case "ON":
	            mySwitch.encender();
	            break;
	         case "OFF":
	            mySwitch.apagar();
	            break;
	         default:
	            System.err.println("Argument \"ON\" or \"OFF\" is required.");
	            System.exit(-1);
	      }
	   }
}
