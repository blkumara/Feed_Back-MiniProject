package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Admin;
import com.ty.dto.CoOrdinate;

public class CoOrdinateDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public CoOrdinate saveCoOrdinate(CoOrdinate coOrdinate) {
		entityTransaction.begin();
		entityManager.persist(coOrdinate);
		entityTransaction.commit();
		return coOrdinate;
	}

	public List<CoOrdinate> getAllCoOrdinates() {
		Query query = entityManager.createQuery("select c from CoOrdinate c");
		return query.getResultList();

	}

	public CoOrdinate validateCoOrdinate(String email, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT c FROM CoOrdinate c WHERE c.email=?1 AND c.password=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<CoOrdinate> coOrdinates = query.getResultList();

		if (coOrdinates.size() > 0)
			return coOrdinates.get(0);
		else
			return null;
	}

	public CoOrdinate updateCoOrdinate(CoOrdinate coOrdinate) {
		CoOrdinate coOrdinate2 = entityManager.find(CoOrdinate.class, coOrdinate);
		coOrdinate2.setId(coOrdinate.getId());
		coOrdinate2.setName(coOrdinate.getName());
		coOrdinate2.setEmail(coOrdinate.getEmail());
		coOrdinate2.setPassword(coOrdinate.getPassword());
		coOrdinate2.setGender(coOrdinate.getGender());

		entityTransaction.begin();
		entityManager.merge(coOrdinate2);
		entityTransaction.commit();
		return coOrdinate2;

	}

	public CoOrdinate deleteCoOrdinate(int id) {
		CoOrdinate coOrdinate = entityManager.find(CoOrdinate.class, id);
		entityTransaction.begin();
		entityManager.remove(coOrdinate);
		entityTransaction.commit();
		return coOrdinate;
	}

}
