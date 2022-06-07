package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Participates;

public class ParticipatesDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Participates saveParticipates(Participates participates) {

		entityTransaction.begin();
		entityManager.persist(participates);
		entityTransaction.commit();
		return participates;

	}

	public List<Participates> getAllParticipates() {
		Query query = entityManager.createQuery("select p from Participates p ");
		return query.getResultList();
	}

	public Participates validateparticipate(String email, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p FROM Participates p WHERE p.email=?1 AND p.password=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<Participates> participates = query.getResultList();

		if (participates.size() > 0) 
			return participates.get(0);
		else 
			return null;
	}

	public Participates updateParticipates(Participates participates) {
		Participates participates2 = entityManager.find(Participates.class, participates);
		participates2.setId(participates.getId());
		participates2.setName(participates.getName());
		participates2.setEmail(participates.getEmail());
		participates2.setGender(participates.getGender());
		entityTransaction.begin();
		entityManager.merge(participates2);
		entityTransaction.commit();
		return participates2;
	}

	public Participates deleteParticipates(int id) {
		Participates participates = entityManager.find(Participates.class, id);
		entityTransaction.begin();
		entityManager.remove(participates);
		entityTransaction.commit();
		return participates;
	}

}
