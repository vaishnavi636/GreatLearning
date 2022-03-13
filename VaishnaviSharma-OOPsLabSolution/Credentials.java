package labAssignment_one;

public class Credentials {

	private String password;

	private int defaultPasswordLength = 10;
	private String companySuffix = "greatlearning.com";

	//Generate a random password
	private String randomPassword(int len) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[len];
		for (int i = 0; i < len; i++) {
			int radm = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(radm);
		}
		return new String(password);
	}

	public String generateEmail(Employee e, String dept) {

		this.password = randomPassword(defaultPasswordLength);

		return e.getFirstName().toLowerCase() + e.getLastName().toLowerCase() + "@" + dept + "."
				+ companySuffix;

	}



//getters
	public String getPassword() {
		return password;
	}

	public void showInfo(Employee e, String dept) {
		System.out.println("Dear " + e.getFirstName() + " " + "your generated credentials are as follows:" + " "
				+ "\n EMAIL --> " + generateEmail(e, dept) + "\n Password --> " + getPassword());
	}

}