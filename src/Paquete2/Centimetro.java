package Paquete2;

public class Centimetro extends LongitudInternacional {
	
	public Centimetro() {
		
	}
	
	public Centimetro(double valor) {
		this.setValor(valor);	
	}
	
	@Override
	String GetAbreviatura() {

		return "cm";
	}
	
	
	@Override
	public Metro Convertir() { // Abstract Convierte centimetros a metros

		return new Metro(getValor() * 0.01);
	}
	
	@Override
	public String ToString() { // Salida: 3cm
		return (getValor() + "" + GetAbreviatura());		
	}
	
			
}
