package com.edgargonzalezm.patrones.creacion.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	public static class Type{
		public static final String OVEJA="oveja";
		public static final String VACA="vaca";
		public static final String BURRO="burro";
	}
	
	private static Map<String,Animal> proptotipos= new HashMap<String,Animal>();
	static{
		proptotipos.put(Type.OVEJA,new Oveja());
		proptotipos.put(Type.VACA,new Vaca());
		proptotipos.put(Type.BURRO,new Burro());
	}
	
	public static Animal getInstance(String s) throws CloneNotSupportedException{
		return ((Animal)proptotipos.get(s)).clone();
	}
}
