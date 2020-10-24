package Paquete2;

public class Pulgada extends LongitudIngles {

	public Pulgada() {
		
	}
	
	public Pulgada(double valor) {
		this.setValor(valor);
	}
	
	
	@Override
	public Pulgada Convertir() { //Abstract Convertir Pulgada a pies

		return new Pulgada(getValor() * 0.083 );
	}

	@Override
	String GetAbreviatura() {

		return "inch";
	}
	
	@Override
	public String ToString() { // Salida: 3inch
		return (getValor() + "" + GetAbreviatura());		
	}
	

}
