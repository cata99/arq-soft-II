package ar.edu.ucc.arqsoft.test.service.baseServices.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqsoft.test.service.common.model.GenericObject;

@Entity
@Table(name="CLIENT")
public class Cliente extends GenericObject{

	@NotNull
	@Size(min=1, max=250)
	@Column (name="NAME")
	private String name;
	
	@NotNull
	@Size(min=1, max=250)
	@Column (name="LAST_NAME")
	private String lastname;
	
	@OneToMany(targetEntity= Pago.class, mappedBy="CLIENTE", fetch=FetchType.LAZY) 
	private Set<Pago> pagos;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(Set<Pago> pagos) {
		this.pagos = pagos;
	}
	
}
