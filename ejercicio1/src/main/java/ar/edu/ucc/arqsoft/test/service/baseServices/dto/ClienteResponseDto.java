package ar.edu.ucc.arqsoft.test.service.baseServices.dto;

import ar.edu.ucc.arqsoft.test.service.common.dto.*;

public class ClienteResponseDto implements DtoEntity{
	
	private String fullName;
	
	private Long id;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}