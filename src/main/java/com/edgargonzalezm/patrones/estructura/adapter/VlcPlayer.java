package com.edgargonzalezm.patrones.estructura.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String nombreArchivo) {
		System.out.println("Ejecutando con VLC el archivo "+nombreArchivo);
		
	}

	@Override
	public void playMp4(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

}
