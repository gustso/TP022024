package ar.edu.unju.fi.ejercicio01.model;

public class Product {
	private String codigo;
	private String descripcion;
	private double nuevoPre;
	private OrigenFabricacion origenFabricacion;
	private Categoria categoria;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String codigo, String descripcion, double precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}	
	
	 public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}

	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	// Enum para OrigenFabricacion
    public enum OrigenFabricacion {
        ARGENTINA, CHINA, BRASIL, URUGUAY
    }

    // Enum para Categoria
    public enum Categoria {
        TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
    }

}
