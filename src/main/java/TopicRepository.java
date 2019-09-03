

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> { //Topic is persistance class and String is data type of ID

}
