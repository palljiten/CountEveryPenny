package model;

public class User 
{
   private int userId;
   private String userName;
   private String userEmailId;
   
   
   public int getUserId() {
	return userId;
   }
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

   
}
