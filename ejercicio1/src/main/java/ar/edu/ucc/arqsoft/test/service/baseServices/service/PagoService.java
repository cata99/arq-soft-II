package ar.edu.ucc.arqsoft.test.service.baseServices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.service.baseServices.dao.*;
import ar.edu.ucc.arqsoft.test.service.baseServices.dto.*;
import ar.edu.ucc.arqsoft.test.service.common.dto.*;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.*;
import java.util.Date;

@Service
@Transactional

public class PagoService {
	
	@Autowired
	private PagoDao pagoDao; 
	
	public PagoResponseDto GetById (Long id) {
		Pago pago = pagoDao.load(id);
		
		PagoResponseDto response = (PagoResponseDto) new ModelDtoConverter().convertToDto(pago, new PagoResponseDto());
		return response;
		
	}
	
	public List<PagoResponseDto> GetByDate(Date date){
		List<Pago> pagos= pagoDao.FindByDate(date);
		
		List<PagoResponseDto> response= new ArrayList<PagoResponseDto>();
		for(Pago pago : pagos) {
			response.add((PagoResponseDto) new ModelDtoConverter().convertToDto(pago, new PagoResponseDto()));
		}
		
		return response;
	}
	
	public List<PagoResponseDto> GetAll() {
		List<Pago> pagos= pagoDao.getAll();
		
		List<PagoResponseDto> response= new ArrayList<PagoResponseDto>();
		for(Pago pago : pagos) {
			response.add((PagoResponseDto) new ModelDtoConverter().convertToDto(pago, new PagoResponseDto()));
		}
		
		return response;
	}
	
	public PagoResponseDto InsertPago (PagoRequestDto request) {
		Pago pago= (Pago) new ModelDtoConverter().convertToEntity(new Pago(), request);
		
		pagoDao.insert(pago);
		
		PagoResponseDto response= (PagoResponseDto) new ModelDtoConverter().convertToDto(pago,new PagoResponseDto());
		
		return response;
	}
}