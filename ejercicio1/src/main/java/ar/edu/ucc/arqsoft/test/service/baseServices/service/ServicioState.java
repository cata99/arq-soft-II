package ar.edu.ucc.arqsoft.test.service.baseServices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.service.baseServices.dao.*;
import ar.edu.ucc.arqsoft.test.service.baseServices.dto.*;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.Servicio;
import ar.edu.ucc.arqsoft.test.service.common.dto.*;

@Service
@Transactional

public class ServicioState {
	
	@Autowired
	private ServiceDao serviceDao; 
	
	public ServiceResponseDto GetById (Long id) {
		Servicio servicio = serviceDao.load(id);
		
		ServiceResponseDto response = (ServiceResponseDto) new ModelDtoConverter().convertToDto(servicio, new ServiceResponseDto());
		return response;
	}
	
	
	public List<ServiceResponseDto> GetAllService() {
		List<Servicio> servicios = serviceDao.getAll();
		
		List<ServiceResponseDto> response= new ArrayList<ServiceResponseDto>();
		
		for(Servicio servicio: servicios) {
			response.add((ServiceResponseDto) new ModelDtoConverter().convertToDto(servicio, new ServiceResponseDto()));
		}
			
		
		return response;
	}
	

	public ServiceResponseDto InsertarService (ServiceRequestDto request) {
		Servicio servicio = (Servicio) new ModelDtoConverter().convertToEntity(new Servicio(), request);
		
		serviceDao.insert(servicio);
		
		ServiceResponseDto response = (ServiceResponseDto) new ModelDtoConverter().convertToDto(servicio, new ServiceResponseDto());
		
		return response;
	}
}