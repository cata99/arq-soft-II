package ar.edu.ucc.arqsoft.test.service.baseServices.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;


import ar.edu.ucc.arqsoft.test.service.baseServices.model.Servicio;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDaoImp;

@Repository
public class ServiceDaoImp extends genericDaoImp<Servicio, Long> implements ServiceDao{
 
	public List<Servicio> FindByName (String nombre){

		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Servicio> criteria = builder.createQuery(Servicio.class);
        Root<Servicio> entity = criteria.from(Servicio.class);

        criteria.select(entity).where(builder.equal(entity.get("SERVICE_NAME"), nombre));
        return em.createQuery(criteria).getResultList();
	}
}

