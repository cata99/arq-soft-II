package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Detalle;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface DetalleDao extends genericDao<Detalle, Long>{
	
	public List<Detalle> FindByName (String nombre);

}
