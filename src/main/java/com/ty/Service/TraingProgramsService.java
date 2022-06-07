package com.ty.Service;

import java.util.List;

import com.ty.dao.TrainingProgramsDao;
import com.ty.dto.TrainingPrograms;

public class TraingProgramsService {

	TrainingProgramsDao trainingProgramsDao = new TrainingProgramsDao();

	public TrainingPrograms saveTrainingPrograms(TrainingPrograms trainingPrograms) {
		return trainingProgramsDao.saveTrainingPrograms(trainingPrograms);

	}

	public TrainingPrograms getTrainingProgramsById(int id) {
		return trainingProgramsDao.getTrainingProgramsById(id);
	}

	public List<TrainingPrograms> getAllTrainingPrograms() {
		return trainingProgramsDao.getAllTrainingPrograms();
	}

	public TrainingPrograms updateTrainingPrograms(TrainingPrograms trainingPrograms) {
		return trainingProgramsDao.updateTrainingPrograms(trainingPrograms);
	}

	public TrainingPrograms deleteTrainingPrograms(int id) {
		return trainingProgramsDao.deleteTrainingPrograms(id);
	}

}
