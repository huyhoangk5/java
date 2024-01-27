package test;
import java.util.*;
public class Product {
	private String ten;
	private String motasanpham;
	private int giaban;
		
	public Product() {
		super();
	}
	
	public Product(String ten, String motasanpham, int giaban) {
		super();
		this.ten = ten;
		this.motasanpham = motasanpham;
		this.giaban = giaban;
	}

	
	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getMotasanpham() {
		return motasanpham;
	}


	public void setMotasanpham(String motasanpham) {
		this.motasanpham = motasanpham;
	}


	public int getGiaban() {
		return giaban;
	}


	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}

	@Override
	public String toString() {
		return "Product [ten=" + ten + ", motasanpham=" + motasanpham + ", giaban=" + giaban + "]";
	}
	
}
	