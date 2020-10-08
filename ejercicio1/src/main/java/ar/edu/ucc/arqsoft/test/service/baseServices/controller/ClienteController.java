package ar.edu.ucc.arqsoft.test.service.baseServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ar.edu.ucc.arqsoft.test.service.baseServices.service.ClienteService;
import ar.edu.ucc.arqsoft.test.service.baseServices.dto.*;
@Controller
@RequestMapping("/cliente")
public class ClienteController{
	
	@Autowired
	private ClienteService clienteService;
	
	 @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody List<ClienteResponseDto> getAllClientes(){
		 
		 return clienteService.GetAllClientes();
	
	 }
	
	 @RequestMapping(value="{/name}",method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody List<ClienteResponseDto> getNames(@PathVariable("name") String name){
		 
		 return clienteService.GetByName(name);
	
	 }
	 
	 @RequestMapping(value="{/id}",method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ClienteResponseDto getById(@PathVariable("id") Long id) {
		 
		 return clienteService.GetById(id);
	 }
	 
	 @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ClienteResponseDto saveCLiente (@RequestBody ClienteRequestDto request) {
		 
		 return clienteService.InsertarCliente(request);
		 
	 }
	 
}