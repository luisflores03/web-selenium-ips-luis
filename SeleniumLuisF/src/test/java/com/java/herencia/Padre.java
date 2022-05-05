package com.java.herencia;

public class Padre {
	private double altura;
	private String tipoSangre,colorOjos;
	
	public Padre(double altura, String tipoSangre, String colorOjos) {
		this.altura = altura;
		this.tipoSangre = tipoSangre;
		this.colorOjos = colorOjos;
	}
	
	public void temperamento() {
		System.out.println("Enojon");
	}
	
	public void deporte() {
		System.out.println("Futbolista");
	}
	//Getters y Setters

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 2.8) {
			this.altura =-1;
		}
		else {
			this.altura = altura;
		}
		
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	

}
