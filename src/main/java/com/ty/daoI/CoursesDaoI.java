package com.ty.daoI;

import java.util.List;

import com.ty.dto.Courses;

public interface CoursesDaoI {
	
	public Courses createCourses(Courses courses);
	
	public List<Courses> getAllCourses() ;
	
	public Courses updateCourses(Courses courses) ;
	
	public Courses deleteCourses(int id) ;
}
