package com.heemsresouces.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic topic)
	// deleteTopics(String id)

}
