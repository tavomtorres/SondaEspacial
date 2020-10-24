package Paquete2;

public class Metro extends LongitudInternacional{
	
	
	
	public Metro() {
		
	}
	public Metro (double valor) {
		
		this.setValor(valor);
	}

	@Override
	String GetAbreviatura() { 

		return "m";
	}
	
	@Override
	public Metro Convertir() { //Devuelve el mismo valor metros

		return this;
	}
	
	@Override
	public String ToString() { // 3m
		return (getValor() + "" + GetAbreviatura());		
	}

}
