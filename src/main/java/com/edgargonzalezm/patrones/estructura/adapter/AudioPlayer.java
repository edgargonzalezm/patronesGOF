package com.edgargonzalezm.patrones.estructura.adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter adapter;
	
	@Override
	public void play(String tipoPlay, String nombreArchivo) {
		if("mp3".equals(tipoPlay)){
			System.out.println("Ejecutando con AudioPlayer el archivo "+nombreArchivo);
		}else if("vlc".equals(tipoPlay) || "mp4".equals(tipoPlay)){
			adapter= new MediaAdapter(tipoPlay);
			adapter.play(tipoPlay, nombreArchivo);
		}else{
			System.out.println(tipoPlay+" Formato invalido");
		}
		
	}

}
