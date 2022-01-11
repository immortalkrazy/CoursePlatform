package com.heemsresouces.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic topic)
	// deleteTopics(String id)

}
