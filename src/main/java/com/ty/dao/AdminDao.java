package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.daoI.AdminDaoI;
import com.ty.dto.Admin;
import com.ty.dto.Courses;

public class AdminDao implements AdminDaoI{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;

	}

	public List<Admin> getAllAdmin() {
		Query query = entityManager.createQuery("select a from Admin a");
		return query.getResultList();

	}
	public Admin validateAdmin(String email, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql="SELECT a FROM Admin a WHERE a.email=?1 AND a.password=?2";

		Query query=entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<Admin> admins=query.getResultList();

		if(admins.size()>0)
			return admins.get(0);
		else
			return null;
	}

	public Admin updateAdmin(Admin admin) {
		Admin admin2 = entityManager.find(Admin.class, admin);
		admin2.setId(admin.getId());
		admin2.setName(admin.getName());
		admin2.setEmail(admin.getEmail());
		admin2.setPassword(admin.getPassword());
		admin2.setPhone(admin.getPhone());

		entityTransaction.begin();
		entityManager.merge(admin2);
		entityTransaction.commit();
		return admin2;
	}

	public Admin deleteAdmin(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		entityTransaction.begin();
		entityManager.remove(admin);
		entityTransaction.commit();
		return admin;
	}
}
