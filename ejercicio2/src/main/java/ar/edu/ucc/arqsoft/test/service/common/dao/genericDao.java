package ar.edu.ucc.arqsoft.test.service.common.dao;

import java.io.Serializable;
import java.util.List;

public interface genericDao<E, ID extends Serializable> {
	
	public void insert(E entity);
	
	public void saveOrUpdate(E entity);

	public void update(E entity);

	public void remove(E entity);

	public E load(ID key);

	public List<E> getAll();
}