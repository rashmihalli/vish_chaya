package dom.jagadish.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.User;
import dom.jagadish.com.model.UserPojo;
import dom.jagadish.com.repository.UserRepository;



@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;

	/*public String validate(User user) 
	{
		
		System.out.println(user);
		List<User> list =userrepository.findAll();
		for (User users : list) {

			if (user.getUserId().equals(users.getUserId()) && user.getEmailId().equals(users.getEmailId())) {
				System.out.println( "valid user");
				return users.getPassword();
				
			}
		}
		return "Invalid User";
	
}
	*/
	

	public String validate(User user) {
		System.out.println(user);
		List<User> list = userrepository.findAll();
		for (User users : list) {

			if (users.getUserId().equals(user.getUserId()) && users.getEmailId().equals(user.getEmailId())) {
				
			
				System.out.println("Valid User" + users.getPassword());
			
			}
		}
		return "Invalid User";
	
}
	
		/*String x=null;
	List<User> userinfo = userrepository.findAll();
		
	 for(User u : userinfo)
        {
		
        if(u.getUserId().equals(user.getUserId()) && u.getEmailId().equals(user.getEmailId()))
        	{
        	
        	System.out.println("chaya");
          return  x= u.getPassword();
          
        	}
  	 
         }
	
         
	 return "ntfrd";*/
	

	
	public User
	addUser(User user) {
		
		return userrepository.save(user);
	}
	
	
	public List<User> getAllUsers() 
	{
	   
		List<User> users = new ArrayList<>();
		userrepository.findAll().forEach(users::add);
		
		return users;
	}

/*public void confirmPassword(User user)
{
	
	List<User> users = userrepository.findAll();
	for(User u : users) {
		
		if(list.getUserName().matches(user.getUserName()))
	 
		list.setPassword(user.getPassword());
	}

	System.out.println("Password changed");
}*/
	
}
	
	




