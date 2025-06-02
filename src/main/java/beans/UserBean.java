package beans;

public class UserBean implements java.io.Serializable{
		private static final long serialVersionUID =1L;
		
		private String password;
		private String last_name;
		private String first_name;
		private String address;
		private String mail_address;

		public UserBean() {
			
		}
		public UserBean(String password, String last_name, String first_name, String address,
				String mail_address) {
			this.password = password;
			this.last_name = last_name;
			this.first_name = first_name;
			this.address = address;
			this.mail_address = mail_address;
		}
		


	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getmail_address() {
		return mail_address;
	}

	public void setmail_address(String mail_address) {
		this.mail_address = mail_address;
	}

}