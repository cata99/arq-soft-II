package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Producto;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface ProductoDao extends genericDao<Producto, Long>{
	
	public List<Producto> FindByName (String nombre);
	
}
