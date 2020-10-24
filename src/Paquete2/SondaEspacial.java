package Paquete2;

public class SondaEspacial<T extends Magnitud> {
	
	public SondaEspacial() {
			
	}
	
	public SondaEspacial(T unidad) {
		
	}
		
	public void Imprimir (T unidad) {
		System.out.println(unidad.ToString() +"\n");
	}


}
