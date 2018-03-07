package com.edgargonzalezm.patrones.estructura.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String nombreArchivo) {
		// no es necesario implementar
		
	}

	@Override
	public void playMp4(String nombreArchivo) {
		System.out.println("Ejecutando con MP4 el archivo "+nombreArchivo);
		
	}

}
