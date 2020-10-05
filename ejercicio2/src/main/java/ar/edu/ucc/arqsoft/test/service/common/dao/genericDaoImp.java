package ar.edu.ucc.arqsoft.test.service.common.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class genericDaoImp<E, ID extends Serializable> implements genericDao<E, ID> {

	@Autowired
    protected EntityManager em;
	
	protected Class<? extends E> daoType;

	@SuppressWarnings("unchecked")
	public genericDaoImp() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		daoType = (Class<? extends E>) pt.getActualTypeArguments()[0];
	}

	public void insert(E entity) {
		em.persist(entity);
	}

	public void saveOrUpdate(E entity) {
		em.persist(entity);
	}

	public void update(E entity) {
		em.persist(entity);
	}

	public void remove(E entity) {
		em.remove(entity);
	}

	public E load(ID key) {
		return em.find(daoType, key);
	}

	@SuppressWarnings("unchecked")
	public List<E> getAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<E> criteria = (CriteriaQuery<E>) builder.createQuery(daoType);
        
        Root<E> member = (Root<E>) criteria.from(daoType);
        criteria.select(member);
        return em.createQuery(criteria).getResultList();
	}
}
