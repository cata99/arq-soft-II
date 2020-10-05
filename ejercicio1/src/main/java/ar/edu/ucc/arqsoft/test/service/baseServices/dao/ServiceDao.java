package ar.edu.ucc.arqsoft.test.service.baseServices.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.test.service.baseServices.model.Servicio;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface ServiceDao extends genericDao<Servicio, Long>{
	
	public List<Servicio> FindByName (String nombre);
}
