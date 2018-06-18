package user;

public class UserDTO {
//***************************
//	data transfer object
//**************************
	
	private String userID;
	private String userPassword;
	private String userEmail;
	private String userEmailHash;
	private boolean userEmailChacked;
	
	
	public UserDTO() {}
	
	public UserDTO(String userID, String userPassword, String userEmail, String userEmailHash,
			boolean userEmailChacked) {
		super();
		this.userID = userID;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userEmailHash = userEmailHash;
		this.userEmailChacked = userEmailChacked;
	}
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEmailHash() {
		return userEmailHash;
	}
	public void setUserEmailHash(String userEmailHash) {
		this.userEmailHash = userEmailHash;
	}
	public boolean isUserEmailChacked() {
		return userEmailChacked;
	}
	public void setUserEmailChacked(boolean userEmailChacked) {
		this.userEmailChacked = userEmailChacked;
	}
	
	


	

	
}
