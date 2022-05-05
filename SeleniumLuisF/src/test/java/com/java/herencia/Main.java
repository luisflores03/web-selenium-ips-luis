package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre Pedro = new Padre(1.75,"O+","café");
		Pedro.temperamento();
		Pedro.setAltura(100);
		System.out.println(Pedro.getAltura());
		
		Hijo pedrohijo = new Hijo(1.75,"O-","café");
		pedrohijo.deporte();
		
		Nieto pedronieto = new Nieto(1.60,"O+","Azúl");
		pedronieto.deporte();
		pedronieto.hobbies();
		
	}

}
