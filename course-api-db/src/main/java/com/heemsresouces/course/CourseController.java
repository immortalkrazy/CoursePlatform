package com.heemsresouces.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heemsresouces.entity.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	// GET ALL
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses() {

		return courseService.getAllCourses(id);

	}

	// GET ONE
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {

		return courseService.getCourse(id);

	}

	// POST / ADD
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {

		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);

	}

	// PUT / UPDATE
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {

		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);

	}

	// DELETE
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
	public void deleteourse(@PathVariable String id) {

		courseService.deleteCourse(id);

	}
}
