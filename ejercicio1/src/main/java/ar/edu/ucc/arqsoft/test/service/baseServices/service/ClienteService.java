package ar.edu.ucc.arqsoft.test.service.baseServices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.service.baseServices.dao.ClienteDao;
import ar.edu.ucc.arqsoft.test.service.baseServices.dto.ClienteResponseDto;
import ar.edu.ucc.arqsoft.test.service.baseServices.dto.ClienteRequestDto;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.Cliente;
import ar.edu.ucc.arqsoft.test.service.common.dto.*;
@Service
@Transactional

public class ClienteService {
	
	@Autowired
	private ClienteDao clienteDao; 

	public List<ClienteResponseDto> GetByName(String name) {
		List<Cliente> clientes = clienteDao.FindByName(name);
		
		List<ClienteResponseDto> response = new ArrayList<ClienteResponseDto>();
		for(Cliente cliente: clientes) {
		response.add((ClienteResponseDto) new ModelDtoConverter().convertToDto(cliente,new ClienteResponseDto()));
		}
		return response;
	}
	
	public ClienteResponseDto GetById(Long id) {
		Cliente cliente = clienteDao.load(id);
		
		ClienteResponseDto response = (ClienteResponseDto) new ModelDtoConverter().convertToDto(cliente,new ClienteResponseDto());
		
		return response;
	}
	
	public List<ClienteResponseDto> GetAllClientes() {
		List<Cliente> clientes = clienteDao.getAll();
		
		List<ClienteResponseDto> response = new ArrayList<ClienteResponseDto>();
		for(Cliente cliente: clientes) {
		response.add((ClienteResponseDto) new ModelDtoConverter().convertToDto(cliente,new ClienteResponseDto()));
		}
		return response;
	}
	
	
	public ClienteResponseDto InsertarCliente (ClienteRequestDto request) {
		Cliente cliente = (Cliente) new ModelDtoConverter().convertToEntity(new Cliente(), request);
	
		clienteDao.insert(cliente);
		
		ClienteResponseDto response = (ClienteResponseDto) new ModelDtoConverter().convertToDto(cliente, new ClienteResponseDto());
		
		return response;
	
	}
}