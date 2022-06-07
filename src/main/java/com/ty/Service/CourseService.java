package com.ty.Service;

import java.util.List;

import com.ty.dao.CourseDao;
import com.ty.dto.Courses;

public class CourseService {
	CourseDao courseDao = new CourseDao();

	public Courses saveCourses(Courses courses) {
		return courseDao.createCourses(courses);
	}

	public List<Courses> getAllCourses() {
		return courseDao.getAllCourses();

	}

	public Courses updateAdmin(Courses courses) {
		return courseDao.updateCourses(courses);
	}

	public Courses deleteAdmin(int id) {
		return courseDao.deleteCourses(id);
	}
}
