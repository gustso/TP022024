package ar.edu.unju.fi.ejercicio05.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import ar.edu.unju.fi.ejercicio05.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio05.model.Producto;
import ar.edu.unju.fi.ejercicio05.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio05.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> productos = new ArrayList<Producto>();
		Producto p01 = new Producto("p01","caracteristica p01",30, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true);
		Producto p02 = new Producto("p01","caracteristica p01",40, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false);
		Producto p03 = new Producto("p01","caracteristica p01",50, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true);
		Producto p04 = new Producto("p01","caracteristica p01",60, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false);
		productos = Arrays.asList(p01,p02,p03,p04);
		
		List<Producto> productosConStock = filtrarPorEstado(productos);
		double monto = calcularPrecioTotal(productosConStock);
		System.out.println("Precio total: "+ monto);
		PagoEfectivo pagoEfectivo = new PagoEfectivo(LocalDate.now());
		pagoEfectivo.realizarPago(monto);
		pagoEfectivo.imprimirRecibo();
	}

	public static List<Producto> filtrarPorEstado(List<Producto> productos) {
        //List<Producto> productosFiltrados = new ArrayList<>();
        //for (Producto producto : productos) {
        //    if (producto.isEstado()) {
        //        productosFiltrados.add(producto);
        //    }
        //}
        //return productosFiltrados;
        
        return productos.stream()
                .filter(producto -> producto.isEstado())
                .collect(Collectors.toList());
    }
	
	public static double calcularPrecioTotal(List<Producto> productos) {
		double acumuladorPrecio = 0.0;
		for (Producto producto : productos) {
			acumuladorPrecio = acumuladorPrecio + producto.getPrecioU();
		}	    
	    return acumuladorPrecio;
    
		//return productos.stream().mapToDouble(Producto::getPrecioU)
		//       .reduce(0.0, (acumulador, precio) -> acumulador + precio);
	}
}
