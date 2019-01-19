package dom.jagadish.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.UserPojo;
import dom.jagadish.com.repository.LoginRespository;



@Service
public class LoginService {

	
	@Autowired
	LoginRespository loginRespository;
	
	public List<UserPojo> getAllUsers() {

		List<UserPojo> users = new ArrayList<>();
		loginRespository.findAll().forEach(users::add);
		
		return users;
		
	}

	public void addUser(UserPojo user) {
		
		loginRespository.save(user);
	}

	public String validate(UserPojo user) {
		System.out.println(user);
		List<UserPojo> list = loginRespository.findAll();
		for (UserPojo users : list) {

			if (user.getUserId().equals(users.getUserId()) && user.getPassword().equals(users.getPassword())) {
				return "valid user";
			}
		}
		return "Invalid User";
	
}
}