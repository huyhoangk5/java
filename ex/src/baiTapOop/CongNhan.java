package baiTapOop;

public class CongNhan extends CanBo {
	private int rank;

	public CongNhan(int rank) {
		super();
		this.rank = rank;
	}
	

	public CongNhan(String name, int age, String gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
		// TODO Auto-generated constructor stub
	}


	public CongNhan() {
		super();
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}


	@Override
	public String toString() {
		return "CongNhan [name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + " ,rank= " + rank + "]";
	}
	

}
