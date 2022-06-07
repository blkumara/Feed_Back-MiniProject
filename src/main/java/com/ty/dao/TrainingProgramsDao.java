package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.daoI.TrainingProgramsI;
import com.ty.dto.Faculties;
import com.ty.dto.TrainingPrograms;

public class TrainingProgramsDao implements TrainingProgramsI{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public TrainingPrograms saveTrainingPrograms(TrainingPrograms trainingPrograms) {
		entityTransaction.begin();
		entityManager.persist(trainingPrograms);
		entityTransaction.commit();
		return trainingPrograms;

	}

	public TrainingPrograms getTrainingProgramsById(int id) {
		return entityManager.find(TrainingPrograms.class, id);
	}

	public List<TrainingPrograms> getAllTrainingPrograms() {
		Query query = entityManager.createQuery("select t from TrainingPrograms t");
		return query.getResultList();

	}

	public TrainingPrograms updateTrainingPrograms(TrainingPrograms trainingPrograms) {
		TrainingPrograms trainingPrograms2 = entityManager.find(TrainingPrograms.class, trainingPrograms);
		trainingPrograms2.setId(trainingPrograms.getId());
		trainingPrograms2.setName(trainingPrograms.getName());
		trainingPrograms2.setStartingDate(trainingPrograms.getStartingDate());
		trainingPrograms2.setEndingDate(trainingPrograms.getEndingDate());
		trainingPrograms2.setFaculitiesName(trainingPrograms.getFaculitiesName());

		entityTransaction.begin();
		entityManager.merge(trainingPrograms2);
		entityTransaction.commit();
		return trainingPrograms2;
	}

	public TrainingPrograms deleteTrainingPrograms(int id) {
		TrainingPrograms trainingPrograms = entityManager.find(TrainingPrograms.class, id);
		entityTransaction.begin();
		entityManager.remove(trainingPrograms);
		entityTransaction.commit();
		return trainingPrograms;
	}

}
