package test;

public class Student {
	private String name;
	private String gender;
	private String date;
	private String country;
	private String major;
	
	public Student() {}

	public Student(String name, String gender, String date, String country, String major) {
		super();
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.country = country;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name: " + name + ", gender: " + gender + ", date: " + date + ", country: " + country + ", major: "
				+ major + "]";
	}
	
	
}
