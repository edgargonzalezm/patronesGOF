package com.edgargonzalezm.patrones.estructura.adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String tipoPlay){
		if("vlc".equalsIgnoreCase(tipoPlay) ){
			advancedMediaPlayer= new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(tipoPlay) ){
			advancedMediaPlayer= new Mp4Player();
		}
	}
	
	@Override
	public void play(String tipoPlay, String nombreArchivo) {
		if("vlc".equalsIgnoreCase(tipoPlay) ){
			advancedMediaPlayer.playVlc(nombreArchivo);
		}else if("mp4".equalsIgnoreCase(tipoPlay) ){
			advancedMediaPlayer.playMp4(nombreArchivo);
		}
		
	}

}
