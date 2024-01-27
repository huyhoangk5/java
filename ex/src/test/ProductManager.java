package test;
import java.util.*;
public class ProductManager {
	public Product[] products;
	private Scanner scanner;
	int index = 0;
	
	public ProductManager() {
		System.out.println("nhap vao so lương san pham muon tao: ");
		scanner = new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());
		products = new Product[length];
		
	}
	
	public Product[] getProduct() {
		return products;
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Product createProduct() {
		System.out.println("Nhập tên sản phẩm: ");
		String ten = scanner.nextLine();
		System.out.println("Nhập mô tả sản phẩm: ");
		String motasanpham = scanner.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		int giaban = Integer.parseInt(scanner.nextLine());
		Product p = new Product(ten, motasanpham, giaban);
		return p;
		
	}
	
	public void addProduct() {
		Product product = createProduct();
		products[index] = product;
		this.index ++;
	}
	
	public void display() {
		for(Product value : products) {
			if(value != null) {
				System.out.println(value.toString());
			}
		}
	}

}
