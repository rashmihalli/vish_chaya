package dom.jagadish.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dom.jagadish.com.model.User;
import dom.jagadish.com.service.UserService;




@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/login")
public class UserController {

	
	@Autowired
	private UserService userservice;
		
	    
	  @RequestMapping(value = "/display",method = RequestMethod.GET)
	  public List<User> getUser() 
	  {
		 return userservice.getAllUsers();
	  }
	  
	  @RequestMapping(value = "/adding",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void create(@RequestBody User user) {
	    	userservice.addUser(user);
	   
	  }
	  
	 @RequestMapping("/roshan")
	 public String getRoshan() {
		 return "Roshna";
	 }
	 

	 /*   @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	        userRepository.deleteById(id); 
	    }
	    */
	    /*@RequestMapping(value = "/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void update(@RequestBody User user) {
	        userRepository.save(user);
	    }*/
	    
	    @PostMapping(value = "/validates")
	    public String isValidates(@RequestBody User user)
	    {
	    	return userservice.validate(user);
	        
	    }
	    
	    
	    
	    
	  }
	    
	    
	
       
