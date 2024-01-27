package baiTapOop;

public class magazine extends document{
	private int ordinalNumber;// số phát hành, số thứ tự
	private int month;//tháng phát hành
	
	public magazine() {
		super();
	}

	public magazine(int ordinalNumber, int month) {
		super();
		this.ordinalNumber = ordinalNumber;
		this.month = month;
	}
	
	public magazine(long id, String imprint, long issue, int ordinalNumber, int month) {
		super(id, imprint, issue);
		this.ordinalNumber = ordinalNumber;
		this.month = month;
		// TODO Auto-generated constructor stub
	}
	

	public int getOrdinalNumber() {
		return ordinalNumber;
	}

	public void setOrdinalNumber(int ordinalNumber) {
		this.ordinalNumber = ordinalNumber;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "magazine [id=" + id + ", imprint=" + imprint + ", issue=" + issue + ", ordinalNumber=" + ordinalNumber
				+ ", month=" + month + "]";
	}
	
	
	

}
