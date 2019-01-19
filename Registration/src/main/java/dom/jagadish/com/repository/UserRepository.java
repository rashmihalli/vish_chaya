package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.User;


public interface UserRepository extends MongoRepository<User, String>{

	

}
