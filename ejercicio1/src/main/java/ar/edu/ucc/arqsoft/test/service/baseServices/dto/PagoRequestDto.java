package ar.edu.ucc.arqsoft.test.service.baseServices.dto;

import java.util.Date;

import ar.edu.ucc.arqsoft.test.service.baseServices.model.ServiceState;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.Servicio;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.Cliente;
import ar.edu.ucc.arqsoft.test.service.common.dto.*;

public class PagoRequestDto implements DtoEntity{
	
	private Date date;
	
	private Long total;
	
	private ServiceState state;
	
	private Servicio service;
	
	private Cliente cliente;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public ServiceState getState() {
		return state;
	}

	public void setState(ServiceState state) {
		this.state = state;
	}

	public Servicio getService() {
		return service;
	}

	public void setService(Servicio service) {
		this.service = service;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}