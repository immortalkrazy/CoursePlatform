package com.heemsresouces.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourses() {

		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	@Override
	public Optional<Course> getCourse(String id) {

		Optional<Course> t = courseRepository.findById(id);
		return t;
	}

	@Override
	public void addCourse(Course course) {

		courseRepository.save(course);
	}

	@Override
	public void updateCourse(Course course) {

		courseRepository.save(course);

	}

	@Override
	public void deleteCourse(String id) {

		courseRepository.deleteById(id);

	}

}
