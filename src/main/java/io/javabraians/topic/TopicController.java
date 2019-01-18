package io.javabraians.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//test
@RestController
public class TopicController {

		// TODO Auto-generated method stub	
	@Autowired
	private TopicService topicService;
	
		@RequestMapping("/topics")
		public List <Topic> getAllTopics() {
			return topicService.getAllTopics();
		}
	}
