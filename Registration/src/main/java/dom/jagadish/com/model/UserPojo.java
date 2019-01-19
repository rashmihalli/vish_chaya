package dom.jagadish.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="UserData")
public class UserPojo {
	
	
	
	//private String id;
	
	@Id
	private String userId;
	private String password;
	/*
	public UserPojo(String id, String userId, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserPojo [id=" + id + ", userId=" + userId + ", password=" + password + "]";
	}
*/
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPojo(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", password=" + password + "]";
	}	
	
	

}
