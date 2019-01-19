package dom.jagadish.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dom.jagadish.com.model.UserPojo;
import dom.jagadish.com.service.LoginService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
		
	    
	  @RequestMapping(value = "/show",method = RequestMethod.GET)
	  public List<UserPojo> getUser() 
	  {
		 return loginService.getAllUsers();
	  }
	  
	  @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void create(@RequestBody UserPojo user) {
		  
	    	loginService.addUser(user);
	   
	  }
	  
	    
	    @RequestMapping(value = "/validate",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public String isValidate(@RequestBody UserPojo user)
	    {
	   System.out.println(user); 
	   System.out.println(loginService.validate(user));
	   return loginService.validate(user);
	        
	    }
	    
	    

}
