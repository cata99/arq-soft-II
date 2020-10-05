package ar.edu.ucc.arqsoft.test.service.baseServices.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqsoft.test.service.baseServices.model.Cliente;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDaoImp;

@Repository
public class ClienteDapImp extends genericDaoImp<Cliente, Long> implements ClienteDao {

	public List<Cliente> FindByName (String nombre){

		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteria = builder.createQuery(Cliente.class);
        Root<Cliente> entity = criteria.from(Cliente.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), nombre));
        return em.createQuery(criteria).getResultList();
	}
}
