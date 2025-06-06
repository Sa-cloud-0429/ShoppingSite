package beans;

public class Beans implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//情報を入れておくための箱//
	private String memberId;
	private String password;
	private String lastName;
	private String firstName;
	private String address;
	private String mailAddress;

	public Beans() {
	}
	//新しい箱を作るときに中身をセットする///
	public Beans(String memberId, String password, String lastName, String firstName, String address,
			String mailAddress) {
		this.memberId = memberId;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.mailAddress = mailAddress;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

}