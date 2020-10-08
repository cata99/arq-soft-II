package ar.edu.ucc.arqsoft.test.service.baseServices.dto;

import ar.edu.ucc.arqsoft.test.service.common.dto.*;

public class ServiceResponseDto implements DtoEntity{

	private String name;
	
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}