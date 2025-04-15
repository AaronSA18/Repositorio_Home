package Conversor;

public class Conversor {
	private double dato;

	public Conversor(double dato) {
		
		this.dato = dato;
	}

	public double getDato() {
		return dato;
	}

	public void setDato(double dato) {
		this.dato = dato;
	}
	// Metodos
	public double fare() {
		return 1.8* dato +32;
	}
	public double millas() {
		return dato*(1/1.609);
	}
	public double min() {
		 
		return  Math.floor(dato/60);
	}
	public double seg() {
		
		return dato%60;
	}
	
	

}
