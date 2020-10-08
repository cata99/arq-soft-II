package ar.edu.ucc.arqsoft.test.service.baseServices.dao;

import java.util.Date;
import java.util.List;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.Pago;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface PagoDao extends genericDao<Pago, Long>{
	
	public List<Pago> FindByDate (Date date);
}
