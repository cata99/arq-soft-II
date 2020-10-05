package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Usuario;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDaoImp;

@Repository
public class UsuarioDaoImp  extends genericDaoImp<Usuario, Long> implements UsuarioDao{

	public List<Usuario> FindByName (String nombre){

		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
        Root<Usuario> entity = criteria.from(Usuario.class);

        criteria.select(entity).where(builder.equal(entity.get("NAME"), nombre));
        return em.createQuery(criteria).getResultList();
	}
}
