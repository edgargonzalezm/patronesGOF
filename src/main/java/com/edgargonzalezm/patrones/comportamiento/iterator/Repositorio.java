package com.edgargonzalezm.patrones.comportamiento.iterator;

public class Repositorio implements Contenedor{
	  public String nombres[] = {"Roberto" , "Juan" ,"Carlos" , "Marcelo"};

	@Override
	public Iterador getIterator() {
		// TODO Auto-generated method stub
		return new NombreIterador();
	}
	
	private class NombreIterador implements Iterador{
		int index;
		
		@Override
		public boolean hasNext() {
			if(index < nombres.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return nombres[index++];
			}
			return null;
		}
		
	}
}
