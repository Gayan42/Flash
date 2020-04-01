package io.gayan.springboot.topicController;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			 
			new Topic("spring","Spring framework","dpring desciption"),
			new Topic("java","java framework","java desciption"),
			new Topic("android","android framework","android desciption")
			
			);
	
	public List<Topic> getAllTopcs(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
	
}
