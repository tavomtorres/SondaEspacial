package Paquete2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {


		Metro metro = new Metro(10); 
		Pies pie = new Pies(5);
		Yarda yarda = new Yarda(3);
		Pulgada pulgada = new Pulgada(3);
		Kilometro km = new Kilometro(1);
		Centimetro cm = new Centimetro(500);
		
		Magnitud aux;
		Magnitud auxAnterior;
			
		Conversor conversor = new Conversor();	
		
		List<LongitudIngles> ListaInglesa = new LinkedList<LongitudIngles>();	//Lista unidades Inglesas
		ListaInglesa.add(pie);
		ListaInglesa.add(yarda);
		ListaInglesa.add(pulgada);
		
		
		List<LongitudInternacional> listaInternacional = new LinkedList<LongitudInternacional>();	// lista unidades internacionales
		listaInternacional.add(metro);
		listaInternacional.add(km);
		listaInternacional.add(cm);

		SondaEspacial<LongitudInternacional> SondaInternacional = new SondaEspacial<LongitudInternacional>(); //Sonda Internacional		
		
		System.out.println("SONDA INTERNACIONAL");
		for (LongitudIngles elemento: ListaInglesa) { //	
			
			auxAnterior = elemento;
			aux = conversor.ConvertirAInternacional(elemento);				
			System.out.println("La magnitud : " +auxAnterior.ToString() + " Fue convertida a" );
			SondaInternacional.Imprimir((LongitudInternacional) aux);
		}
		
		System.out.println("------------------------------");
		
		SondaEspacial<LongitudIngles> SondaInglesa = new SondaEspacial<LongitudIngles>(); //Sonda Britanica		
		System.out.println("SONDA BRITANICA");
		for (LongitudInternacional elemento: listaInternacional) { //	
			
			auxAnterior = elemento;
			aux = conversor.ConvertirAIngles(elemento);		
			
			System.out.println("La magnitud : " +auxAnterior.ToString() + " Fue convertida a  " );
			SondaInglesa.Imprimir((LongitudIngles) aux );
		}
		
		
			  
		
		
	}

}
