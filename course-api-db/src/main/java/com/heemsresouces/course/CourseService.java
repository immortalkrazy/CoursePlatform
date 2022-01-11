package com.heemsresouces.course;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface CourseService {

	public List<Course> getAllCourses(String topidId);

	public Optional<Course> getCourse(String id);

	public void addCourse(Course course);

	public void updateCourse(Course course);

	public void deleteCourse(String id);

}
