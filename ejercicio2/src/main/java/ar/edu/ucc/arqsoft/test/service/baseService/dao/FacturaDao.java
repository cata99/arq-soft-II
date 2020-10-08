package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Factura;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface FacturaDao extends genericDao<Factura, Long>{
	
	public List<Factura> FindByNumber (String number);
	
}
