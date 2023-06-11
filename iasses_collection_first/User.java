package iasses_collection_first;

import java.util.Objects;



public class User implements Comparable<User> {
   @Override
	public String toString() {
		return "User [username=" + username + ", bankname=" + bankname + "]";
	}
@Override
	public int hashCode() {
	 final int prime=31;
	 int res=0;
	 for(int i=0;i<this.getUsername().length();i++)
	 {
		 res=prime*res+this.getUsername().charAt(i);
	 }
	 return res;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(username, other.username);
	}
public User() {
	}
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
public User(String username, String bankname) {
		super();
		this.username = username;
		this.bankname = bankname;
	}
String username;
   String bankname;
@Override
public int compareTo(User o) {
	 return username.compareTo(o.username);
}

}
