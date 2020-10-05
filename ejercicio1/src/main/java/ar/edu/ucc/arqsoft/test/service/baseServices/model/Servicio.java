package ar.edu.ucc.arqsoft.test.service.baseServices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType; // preguntar al profe
import javax.persistence.JoinColumn; //preguntar al profe
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//servicio no deberia tener un pago?
@Entity
@Table(name ="SERVICIO")
public class Servicio {
 
	@NotNull
	@Size(min=1, max=250)
	@Column(name = "SERVICE_NAME")
	private String servicename;
	

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

}
