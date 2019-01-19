package dom.jagadish.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserData")
public class User {
	
	
		@Id
		private String userId;
		

		@Override
		public String toString() {
			return "User [userId=" + userId + ", emailId=" + emailId + ", password=" + password + "]";
		}

		private String emailId;
		
		private String password;
		
		public User() {
			
		}
		/*public User(String emailId, String userId) {
			super();
			this.emailId = emailId;
			this.userId = userId;
		}
	*/

		public User(String emailId, String userId, String password) {
			super();
			this.emailId = emailId;
			this.userId = userId;
			this.password = password;
		}


		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
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
		
		
}
		
		
		