

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	@Autowired
	private TopicRepository tr;
	
	public List<Topic> getAll(){
		List<Topic> topics = new ArrayList<Topic>();
		tr.findAll()					//get all in ittrable format
		.forEach(topics::add);			//itterate over each element and add them in arraylist
		
		return  topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return tr.findById(id);
	}

	public void addTopic(Topic t) {
		tr.save(t);
	}

	
	public void updateTopic(String id, Topic topic) {
		tr.save(topic);
	}

	public void deleteTopic(String id) {
		tr.deleteById(id);
	}
		
}
