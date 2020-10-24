package Paquete2;

public class Pies extends LongitudIngles {
	
	public Pies() {
		
	}
	
	public Pies(double valor) {
		this.setValor(valor);
		
	}

	@Override
	public Pies Convertir() { //Abstract Convertir devuelve los mismos pies

		return this;
	}

	@Override
	String GetAbreviatura() {

		return "ft";
	}

	@Override
	public String ToString() { // Salida: 3ft
		return (getValor() + "" + GetAbreviatura());		
	}
	

}
