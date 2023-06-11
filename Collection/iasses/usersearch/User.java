package Collection.iasses.usersearch;

import java.util.Objects;

public class User implements Comparable<User>{
   @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	   if(this==obj)
		    return true;
	   if (!(obj instanceof User)) {
           return false;
       }
       User otherUser = (User) obj;
       return userName.equals(otherUser.userName);
	}
  
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		 final int prime=31;
		 int res=0;
		 for(int i=0;i<this.getUserName().length();i++)
		 {
			 res=prime*res+this.getUserName().charAt(i);
		 }
		 return res;
	}
public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
    public int compareTo(User otherUser) {
        return userName.compareTo(otherUser.userName);
    }
public User(String userName, String bankName) {
		super();
		this.userName = userName;
		this.bankName = bankName;
	}
private String userName;
   private String bankName;
   
}
