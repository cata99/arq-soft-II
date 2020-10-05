package ar.edu.ucc.arqsoft.test.service.baseServices.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.test.service.baseServices.model.Cliente;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface ClienteDao extends genericDao<Cliente, Long>{

		public List<Cliente> FindByName (String nombre);
}
