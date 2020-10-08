package ar.edu.ucc.arqsoft.test.service.baseServices.dto;

import java.util.Date;

import ar.edu.ucc.arqsoft.test.service.common.dto.*;

public class PagoResponseDto implements DtoEntity{

	private Date date;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}