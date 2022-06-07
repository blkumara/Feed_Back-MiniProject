package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.daoI.FeedBackI;
import com.ty.dto.FeedBack;

public class FeedBackDao implements FeedBackI{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public FeedBack saveFeedBack(FeedBack feedBack) {
		entityTransaction.begin();
		entityManager.persist(feedBack);
		entityTransaction.commit();
		return feedBack;

	}

	public FeedBack getFeedBackById(int id) {
		return entityManager.find(FeedBack.class, id);
	}

	public List<FeedBack> getAllFeedBack() {
		Query query = entityManager.createQuery("select f from FeedBack f");
		return query.getResultList();

	}

	public FeedBack updateFeedBack(FeedBack feedBack) {
		FeedBack feedBack2 = entityManager.find(FeedBack.class, feedBack);
		feedBack2.setId(feedBack.getId());
		feedBack2.setRating(feedBack.getRating());
		feedBack2.setDescription(feedBack.getDescription());

		entityTransaction.begin();
		entityManager.merge(feedBack2);
		entityTransaction.commit();
		return feedBack2;
	}

	public FeedBack deleteFeedBack(int id) {
		FeedBack feedBack = entityManager.find(FeedBack.class, id);
		entityTransaction.begin();
		entityManager.remove(feedBack);
		entityTransaction.commit();
		return feedBack;
	}

}
