package Exception.Design.third;

public class ContactDetail {
   @Override
	public String toString() {
		return "mobile:" + mobile + "\nalternateMobile:" + alternateMobile + "\nlandline:" + landline
				+ "\nemail:" + email + "\naddress:" + address;
	}
public ContactDetail(String mobile, String alternateMobile, String landline, String email, String address) {
		super();
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.landline = landline;
		this.email = email;
		this.address = address;
	}
public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
private String mobile;
   private String alternateMobile;
   private String landline;
   private String email;
   private String address;
   
}
