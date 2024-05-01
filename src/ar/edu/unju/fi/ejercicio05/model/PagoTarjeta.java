package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoTarjeta implements Pago{
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		montoPagado = 1.15 * monto;
	}
	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Numero de Tarjeta: "+numeroTarjeta);
		System.out.println("Fecha de Pago: "+fechaPago);
		System.out.println("Monto Pagado: "+montoPagado);
	}
	
	

}
