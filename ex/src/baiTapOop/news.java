package baiTapOop;

public class news extends document{
	private int day;//ngày phát hành

	public news() {
		super();
	}

	public news(int day) {
		super();
		this.day = day;
	}

	public news(long id, String imprint, long issue, int day) {
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
		return "news [id=" + id + ", imprint=" + imprint + ", issue=" + issue + ", day=" + day + "]";
	}
	
	

}
