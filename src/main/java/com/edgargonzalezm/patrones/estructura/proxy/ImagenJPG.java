package com.edgargonzalezm.patrones.estructura.proxy;

public class ImagenJPG implements Imagen{

	private String nombreImagen;
	
	public ImagenJPG(String nombreImagen){
		this.nombreImagen=nombreImagen;
		loadFromDisk(this.nombreImagen);
	}
	
	private void loadFromDisk(String nombreImagen){
		System.out.println("Leyendo desde Disco "+nombreImagen);
	}
	
	@Override
	public void display() {
		System.out.println("Imagen "+nombreImagen);
		
	}

}
