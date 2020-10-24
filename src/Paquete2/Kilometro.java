package Paquete2;

public class Kilometro extends LongitudInternacional{
	
	public Kilometro() {
		
	}
	
	public Kilometro(double valor) {
		this.setValor(valor);
	}
	
	
	@Override
	String GetAbreviatura() {
		// TODO Auto-generated method stub
		return "km";
	}
	

	@Override
	public Metro Convertir() { // Convierte km a metros.		
		return new Metro (getValor() * 1000 );
	}
	
	@Override
	public String ToString() { // Salida: 3km
		return (getValor() + "" + GetAbreviatura());		
	}
	
	
	
}
