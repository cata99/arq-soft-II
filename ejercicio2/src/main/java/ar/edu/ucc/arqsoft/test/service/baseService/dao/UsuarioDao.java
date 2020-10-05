package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import java.util.List;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Usuario;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDao;

public interface UsuarioDao extends genericDao<Usuario, Long>{
	
	public List<Usuario> FindByName (String nombre);

}
