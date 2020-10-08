package ar.edu.ucc.arqsoft.test.service.baseServices.dto;

import java.util.Set;

import ar.edu.ucc.arqsoft.test.service.baseServices.model.Pago;
import ar.edu.ucc.arqsoft.test.service.common.dto.*;

public class ClienteRequestDto implements DtoEntity{
	
	private String name;
	
	private String lastName;

	private Set<Pago> pagos;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(Set<Pago> pagos) {
		this.pagos = pagos;
	}

}