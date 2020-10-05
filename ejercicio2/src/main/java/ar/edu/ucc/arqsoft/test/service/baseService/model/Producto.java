package ar.edu.ucc.arqsoft.test.service.baseService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqsoft.test.service.common.model.GenericObject;

@Entity
@Table (name = "PRODUCTO")
public class Producto extends GenericObject{
	
	@NotNull
	@Size(min=1, max=250)
	@Column (name="NAME")
	private String nombre;
	
	@NotNull
	@Column (name = "PRECIO_UNITARIO")
	private Long precioUnitario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	
}
