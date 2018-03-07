package com.edgargonzalezm.patrones.creacion.singleton;

public class Singleton {

	private static Singleton INSTANCE = null;
	private double id;

	/**
	 * Constructor privado para tener un �nico punto de creaci�n
	 */
	private Singleton() {
		id=Math.random()*1000;
	}

	/**
	 * Con este metodo se obtiene la instancia desde otra clase.
	 * @return
	 */
	public static Singleton getInstance() {
		if(INSTANCE==null){
			createInstance();
		}
		return INSTANCE;
	}
	
	/**
	 * sincronizado para proteger de posibles problemas multi-hilo
	 */
	private synchronized static void createInstance(){
		if(INSTANCE==null){
			INSTANCE = new Singleton();			
		}
		
	}
	
	public String getName(){		
		return "Singleton";
	}
	
	public double getId(){
		return id;
	}

}
