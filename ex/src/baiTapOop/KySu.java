package baiTapOop;

public class KySu extends CanBo {
	private String nganhdaotao;
	
	public KySu() {
		super();
	}
	
	public KySu(String nganhdaotao) {
		super();
		this.nganhdaotao = nganhdaotao;
	}
	

	public KySu(String name, int age, String gender, String address, String nganhdaotao) {
		super(name, age, gender, address);
		this.nganhdaotao = nganhdaotao;
		// TODO Auto-generated constructor stub
	}

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}

	@Override
	public String toString() {
		return "KySu [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + " ,nganhdaotao= " +nganhdaotao + "]";
	}

	
}