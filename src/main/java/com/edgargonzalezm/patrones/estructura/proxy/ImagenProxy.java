package com.edgargonzalezm.patrones.estructura.proxy;

public class ImagenProxy implements Imagen{

	private ImagenJPG jpg;
	private String nombreImagen;
	
	public ImagenProxy(String nombreImagen){
		this.nombreImagen=nombreImagen;
	}
	
	@Override
	public void display() {
		if ( jpg == null ){
			jpg= new ImagenJPG(nombreImagen);
		}
		jpg.display();
	}

}
