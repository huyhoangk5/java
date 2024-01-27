package baiTapOop;

public class NhanVien extends CanBo {
	private String job;

	public NhanVien() {
		super();
	}

	public NhanVien(String job) {
		super();
		this.job = job;
	}
	

	public NhanVien(String name, int age, String gender, String address, String job) {
		super(name, age, gender, address);
		this.job = job;
		// TODO Auto-generated constructor stub
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + " ,job= " + job + "]";
	}
	

}