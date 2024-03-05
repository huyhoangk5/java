package Case3;

public class Footballer {
	private long id;
	private String name;
	private int age;
	private String sex;
	private String address;
	private int goal;// số bàn thắng
	private int match;// số trận tham gia
	private String money;
	
	public Footballer() {
		super();
	}

	public Footballer(long id, String name, int age, String sex, String address, int goal, int match, String money) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.goal = goal;
		this.match = match;
		this.money = money;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int getMatch() {
		return match;
	}

	public void setMatch(int match) {
		this.match = match;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Footballer [id = " + id + ", name = " + name + ", age = " + age + ", sex = " + sex + ", address = " + address
				+ ", goal = " + goal + ", match = " + match + ", money = " + money + "]";
	}

}
