package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Producto;

import ar.edu.ucc.arqsoft.test.service.common.dao.genericDaoImp;

@Repository
public class ProductoDaoImp extends genericDaoImp<Producto, Long> implements ProductoDao{

	public List<Producto> FindByName (String nombre){

		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Producto> criteria = builder.createQuery(Producto.class);
        Root<Producto> entity = criteria.from(Producto.class);

        criteria.select(entity).where(builder.equal(entity.get("NAME"), nombre));
        return em.createQuery(criteria).getResultList();
	}
}
