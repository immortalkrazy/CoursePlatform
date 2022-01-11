package com.heemsresouces.repository;

import org.springframework.data.repository.CrudRepository;

import com.heemsresouces.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic topic)
	// deleteTopics(String id)

}
