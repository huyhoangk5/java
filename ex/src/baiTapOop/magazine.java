package baiTapOop;

public class magazine extends document{
	private int day;//ngày phát hành

	public magazine() {
		super();
	}

	public magazine(int day) {
		super();
		this.day = day;
	}

	public magazine(long id, String imprint, long issue, int day) {
		super(id, imprint, issue);
		this.day = day;
		// TODO Auto-generated constructor stub
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "magazine [id=" + id + ", imprint=" + imprint + ", issue=" + issue + ", day=" + day + "]";
	}
	
	

}
