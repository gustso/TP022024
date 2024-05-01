package ar.edu.unju.fi.ejercicio05.model;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precioU;
	private OrigenFabricacion origenFabricacion;
	private Categoria categoria;
	private boolean estado;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}	

	public Producto(String codigo, String descripcion, double precioU, OrigenFabricacion origenFabricacion,
			Categoria categoria, boolean estado) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioU = precioU;
		this.origenFabricacion = origenFabricacion;
		this.categoria = categoria;
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecioU() {
		return precioU;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}	
	
	public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioU=" + precioU
				+ ", origenFabricacion=" + origenFabricacion + ", categoria=" + categoria + ", estado=" + estado + "]";
	}	

}
