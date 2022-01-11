package com.heemsresouces.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<>(
//			Arrays.asList(new Topic("Sping", "Spring Framework", "Spring Fraework Description"),
//					new Topic("Java", "Core Java", "Core Java Description"),
//					new Topic("JavaScript", "JavaScript", "JavaScript Description")));

	@Override
	public List<Topic> getAllTopics() {

//		return topics;
		List<Topic> topics = new ArrayList<>();

		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	@Override
	public Optional<Topic> getTopic(String id) {

		// #1
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

		Optional<Topic> t = topicRepository.findById(id);
		return t;
	}

	@Override
	public void addTopic(Topic topic) {

//		topics.add(topic);
		topicRepository.save(topic);
	}

	@Override
	public void updateTopic(String id, Topic topic) {

//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}

		topicRepository.save(topic);
	}

	@Override
	public void deleteTopic(String id) {

//		topics.removeIf(t -> t.getId().equals(id));

		topicRepository.deleteById(id);

	}

}
