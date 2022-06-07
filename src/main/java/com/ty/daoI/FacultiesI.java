package com.ty.daoI;

import java.util.List;

import com.ty.dto.Faculties;

public interface FacultiesI {

	public Faculties saveFaculties(Faculties faculties);

	public Faculties getFacultiesById(int id);

	public List<Faculties> getAllFaculties();

	public Faculties updateFaculties(Faculties faculties);

	public Faculties deleteFaculties(int id);

}
