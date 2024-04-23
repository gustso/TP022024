package ar.edu.unju.fi.ejercicio02.main;

import ar.edu.unju.fi.ejercicio02.constants.Mes;
import ar.edu.unju.fi.ejercicio02.model.Efemerides;
import ar.edu.unju.fi.ejercicio02.util.Listado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Efemerides efemerides = new Efemerides("e01",Mes.ABRIL,5,"dia de la marmota");
		
		Listado.listadoEfemerides.add(efemerides);
		
		System.out.println("Lista: "+Listado.listadoEfemerides.get(0));
	}

}
