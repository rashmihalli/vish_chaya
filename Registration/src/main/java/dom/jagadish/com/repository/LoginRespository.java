package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.UserPojo;



public interface LoginRespository extends MongoRepository<UserPojo, String> 
{

}
