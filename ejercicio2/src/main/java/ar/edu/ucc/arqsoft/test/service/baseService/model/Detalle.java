package ar.edu.ucc.arqsoft.test.service.baseService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqsoft.test.service.common.model.GenericObject;

@Entity
@Table(name= "DETALLE")
public class Detalle extends GenericObject {

	private Producto producto; //aca seria one to one?
	
	@NotNull
	@Column(name= "CANTIDAD")
	private Long cantidad;
	
	@NotNull
	@Column(name="PRECIO")
	private Long precio;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	

	
	
	
}
