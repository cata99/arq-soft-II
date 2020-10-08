package ar.edu.ucc.arqsoft.test.service.baseService.dao;

import ar.edu.ucc.arqsoft.test.service.baseService.model.Factura;
import ar.edu.ucc.arqsoft.test.service.baseService.model.Producto;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDaoImp;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

@Repository
public class FacturaDaoImp extends genericDaoImp<Factura, Long> implements FacturaDao{


	public List<Factura> FindByNumber (String number){

		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Factura> criteria = builder.createQuery(Factura.class);
        Root<Factura> entity = criteria.from(Factura.class);

        criteria.select(entity).where(builder.equal(entity.get("NUMERO_FACTURA"), number));
        return em.createQuery(criteria).getResultList();
	}
}
