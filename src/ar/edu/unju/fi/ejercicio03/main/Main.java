package ar.edu.unju.fi.ejercicio03.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio03.constants.Provincia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(Provincia.CATAMARCA.getCantidadPoblacion());
		 * System.out.println(Provincia.JUJUY.getSuperficie());
		 * System.out.println(Provincia.SALTA.calcularDensidadPoblacional());
		 * Provincia.CATAMARCA.setCantidadPoblacion(200);
		 * System.out.println(Provincia.CATAMARCA.getCantidadPoblacion());
		 * 
		 * System.out.println(Arrays.toString(Provincia.values())); //List<Provincia>
		 * listado = new ArrayList<Provincia>();
		 * 
		 * Provincia[] listado = Provincia.values();
		 * 
		 * for(Provincia p : listado ) { System.out.println(p.toString()); }
		 */
		
		
		
		//filter
		// Identificar los números pares de una Lista
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Filtrar usando una lambda expression Predicado
		List<Integer> numerosPares = numeros.stream()
		  .filter(n -> n % 3 == 0)  // (divisible por 2)
		  .collect(Collectors.toList());

		System.out.println("listado de Pares" + numerosPares); 
		
		
		//map
		// transformar las palabras de una Lista en mayúsculas
		List<String> nombres = Arrays.asList("Alicia", "Dario", "Roma", "Gustavo");

		// Convertir nombres a mayúscula usando lambda expression
		List<String> nombresMayuscula = nombres.stream()
		  .map(name -> name.toUpperCase()) //pasar a Mayúscula  
		  .collect(Collectors.toList());

		System.out.println("listado de nombres en MAYUSCULA: "+nombresMayuscula); 
		
		
		//reduce
		// Obtener la suma de todos los elementos de una Lista
		List<Integer> otrosNumeros = Arrays.asList(1, 2, 3, 4, 5);

		// Sumar los numeros
		int suma = otrosNumeros.stream()
			.reduce(0, (accumulator, number) -> accumulator + number); //acumular

		System.out.println("La suma de los números es: " + suma);  


		
		//stream
		List<String> names = Arrays.asList("Alicia", "Carlos", "Monica", "Gustavo","Mario");

		List<String> upperCaseNames = names.stream()
		  .filter(name -> name.toUpperCase().startsWith("M"))
		  .map(name -> name.toUpperCase())
		  .collect(Collectors.toList());

		System.out.println(upperCaseNames);
		

		
		
		// Interfaz funcional
		Calculadora calc;
		
		//una expresion lambda usando la interfaz funcional como funcion
		calc = (numA, numB)-> numA*numB; 
		
		int resultado = calc.operar(5,6);
		
		System.out.println(resultado);
		
		calc = (numA, numB)-> {
			numA = (int) Math.pow(numA, numB);
			return numA;
			};
		resultado = calc.operar(5,3);
		
		System.out.println(resultado);
	}

}
