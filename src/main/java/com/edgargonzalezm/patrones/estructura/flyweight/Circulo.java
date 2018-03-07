package com.edgargonzalezm.patrones.estructura.flyweight;

public class Circulo implements Figura {

	private String color;
	private int coordenadaX;
	private int coordenadaY;
	private int radio;
	
	@Override
	public void draw() {
		System.out.println(this); 
		
	}

	public Circulo(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [color=" + color + ", coordenadaX=" + coordenadaX
				+ ", coordenadaY=" + coordenadaY + ", radio=" + radio + "]";
	}

}
