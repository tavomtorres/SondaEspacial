package Paquete2;

public class Conversor {


	private double FACTOR_INGLESTOINTER = 0.304; //pies a metros
	private double FACTOR_INTERTOINGLES = 3.280; //metros a pies
	
	
	public Conversor() {
		
	}
	
	/*
	+ ConvertirAInternacional(LongitudIngles): Metro
	+ ConvertirAIngles(LongitudInternacional): Pie
	*/
	
	public Metro ConvertirAInternacional(LongitudIngles unidad) {		
		if (unidad instanceof Yarda ) { //Primero convierto yarda a pies y luego a sistema internacional		
			return new Metro(unidad.Convertir().getValor() * FACTOR_INGLESTOINTER); 	
		}
		
		else if(unidad instanceof Pulgada) { //Primero convierto Pulgada a pies y luego a sistema internacional	
			return new  Metro(unidad.Convertir().getValor() * FACTOR_INGLESTOINTER);
		}
		
		else if (unidad instanceof Pies) { // convierto pies a sistema internacional osea metros
			return new Metro(unidad.getValor()* FACTOR_INGLESTOINTER);			
	 	}
		else {
			return null; //Deberia retornar una exception con un mensaje pero nose porque me da error hacia las clases padres
		}
			
	}
	
	
	public Pies ConvertirAIngles(LongitudInternacional unidad) {		
		if (unidad instanceof Kilometro ) { //Convertir kilometro a metro, y luego a sistema Ingles	
			return new Pies(unidad.Convertir().getValor() * FACTOR_INTERTOINGLES); 	
		}
		
		else if(unidad instanceof Centimetro) { //Convertir Centimetro a metro y luego a sistema Ingles	
			return new  Pies(unidad.Convertir().getValor() * FACTOR_INTERTOINGLES);
		}
		
		else if (unidad instanceof Metro) { // convierto metros a pies 
			return new Pies(unidad.getValor()* FACTOR_INTERTOINGLES);			
	 	}
		else {
			return null; //Deberia retornar una exception con un mensaje pero nose porque me da error hacia las clases padres
		}
			
	}
	
	
}
