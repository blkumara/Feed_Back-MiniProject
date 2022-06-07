package com.ty.daoI;

import java.util.List;

import com.ty.dto.TrainingPrograms;

public interface TrainingProgramsI {

	public TrainingPrograms saveTrainingPrograms(TrainingPrograms trainingPrograms);

	public TrainingPrograms getTrainingProgramsById(int id);

	public List<TrainingPrograms> getAllTrainingPrograms();

	public TrainingPrograms updateTrainingPrograms(TrainingPrograms trainingPrograms);

	public TrainingPrograms deleteTrainingPrograms(int id);

}
