package ar.edu.unju.fi.ejercicio01.main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio01.model.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Product> listado = new ArrayList<Product>();
		Product prod01 = new Product();
		prod01.setCategoria(Product.Categoria.ELECTROHOGAR);
		prod01.setCodigo("C001");
		prod01.setDescripcion("newva descrip");
		prod01.setOrigenFabricacion(Product.OrigenFabricacion.CHINA);
		
		listado.add(prod01);

	}

}
