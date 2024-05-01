package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoEfectivo implements Pago{
	private LocalDate fechaPago;
	private double montoPagado;

	public PagoEfectivo() {
		// TODO Auto-generated constructor stub
	}	
	
	public PagoEfectivo(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		montoPagado = 0.90 * monto;
	}

	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub	
		System.out.println("Fecha de Pago: "+fechaPago);
		System.out.println("Monto Pagado: "+montoPagado);
	}

}
