package ar.edu.ucc.arqsoft.test.service.baseServices.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import ar.edu.ucc.arqsoft.test.service.baseServices.model.Pago;
import ar.edu.ucc.arqsoft.test.service.common.dao.genericDaoImp;

@Repository
public class PagoDaoImp  extends genericDaoImp<Pago, Long> implements PagoDao{

	public List<Pago> FindByDate (Date date){

		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pago> criteria = builder.createQuery(Pago.class);
        Root<Pago> entity = criteria.from(Pago.class);

        criteria.select(entity).where(builder.equal(entity.get("FECHA"), date));
        return em.createQuery(criteria).getResultList();
	}
}
