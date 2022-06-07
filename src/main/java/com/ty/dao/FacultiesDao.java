package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.daoI.FacultiesI;
import com.ty.dto.Admin;
import com.ty.dto.Courses;
import com.ty.dto.Faculties;

public class FacultiesDao implements FacultiesI{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Faculties saveFaculties(Faculties faculties) {
		entityTransaction.begin();
		entityManager.persist(faculties);
		entityTransaction.commit();
		return faculties;

	}

	public Faculties getFacultiesById(int id) {
		return entityManager.find(Faculties.class, id);
	}

	public List<Faculties> getAllFaculties() {
		Query query = entityManager.createQuery("select f from Faculties f");
		return query.getResultList();

	}

	public Faculties updateFaculties(Faculties faculties) {
		Faculties faculties2 = entityManager.find(Faculties.class, faculties);
		faculties2.setId(faculties.getId());
		faculties2.setName(faculties.getName());
		faculties2.setEmail(faculties.getEmail());
		faculties2.setPassword(faculties.getPassword());
		faculties2.setPhone(faculties.getPhone());

		entityTransaction.begin();
		entityManager.merge(faculties2);
		entityTransaction.commit();
		return faculties2;
	}

	public Faculties deleteFaculties(int id) {
		Faculties faculties = entityManager.find(Faculties.class, id);
		entityTransaction.begin();
		entityManager.remove(faculties);
		entityTransaction.commit();
		return faculties;
	}

}
