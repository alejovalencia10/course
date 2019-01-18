package io.javabraians.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public List <Topic> topics= Arrays.asList(
				new Topic(1,"spring"),
				new Topic(2,"springboot")
				);

	public List <Topic> getAllTopics(){
		return topics;
	}
}
