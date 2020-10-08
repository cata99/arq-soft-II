package ar.edu.ucc.arqsoft.test.service.baseService.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType; // preguntar al profe
import javax.persistence.JoinColumn; //preguntar al profe
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import ar.edu.ucc.arqsoft.test.service.common.model.GenericObject;

@Entity
@Table (name= "FACTURA")
public class Factura extends GenericObject{
	
	@ManyToOne (fetch =FetchType.LAZY) // NO SERIA ONE TO MANY?
	@JoinColumn(name="USUARIO_ID")
	private Usuario usuario;
	
	@NotNull
	@Column(name = "FECHA")
	private Date fecha;
	
	@NotNull
	@Column (name = "NUMERO_FACTURA")
	private Long numero;
	
	@NotNull
	@Column (name = "TOTAL")
	private Long total;
	
	@Enumerated (value= EnumType.STRING)
	@Column(name="FACTURA_STATE")
	private FacturaState facturaState;
	
	@OneToMany (targetEntity =Detalle.class) 
	private Set<Detalle> detalle;
	
	public FacturaState getFacturaState() {
		return facturaState;
	}

	public void setFacturaState(FacturaState facturaState) {
		this.facturaState = facturaState;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Set<Detalle> getDetalle() {
		return detalle;
	}

	public void setDetalle(Set<Detalle> detalle) {
		this.detalle = detalle;
	}




	
}
