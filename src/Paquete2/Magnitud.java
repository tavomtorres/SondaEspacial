package Paquete2;

public abstract class  Magnitud<T> {
	
	 private double valor;
	
	 abstract T Convertir();
	 abstract String GetAbreviatura();
	 abstract String ToString();

	 
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	 
	 
}


