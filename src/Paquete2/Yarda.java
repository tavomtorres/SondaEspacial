package Paquete2;

public class Yarda extends LongitudIngles{

	public Yarda() {
		
	}
	
	public Yarda(double valor) {
		this.setValor(valor);
		
	}

	@Override
	public Yarda Convertir() { //abstract Convertir de Yarda a pies 

		return new Yarda(getValor() * 3);
	}

	@Override
	String GetAbreviatura() {

		return "yd";
	}

	@Override
	public String ToString() { // Salida: 3cm
		return (getValor() + "" + GetAbreviatura());		
	}
	
	
}
