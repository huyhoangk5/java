package baiTapOop.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
	private Scanner scan;
	private List<Product> products;
	
	public ProductManager() {
		this.products =  new ArrayList<>();
	}
	
	public Product newProduct(int choicey) {
		Product pro;
		System.out.println("Nhập vào id sản phẩm: ");
		long id = scan.nextLong();
		System.out.println("Nhập vào tên sản phẩm: ");
		String name = scan.nextLine();
		System.out.println("Nhập vào giá sản phẩm: ");
		double price = scan.nextDouble();
		System.out.println("Nhập vào số lượng sản phẩm: ");
		int quantity = scan.nextInt();
		//chọn category
		Category category = choiceCategory();
		pro = new Product(id, name, price, quantity, category);
		return pro;
		}
	
	private enum Category{
		Điện_tử,
		Đồ_ăn,
		Nước_uống
	}
	
	public Category choiceCategory() {
		System.out.println("Chọn Category");
		System.out.println("1. Điện tử");
		System.out.println("2. Đồ ăn");
		System.out.println("3. Nước uống");
		System.out.println("Nhập vào lựa chọn: ");
		int choiceCategory = inputNumber(scan);
		if (choiceCategory == 1) {
			return Category.Điện_tử;
		}else if (choiceCategory == 2) {
			return Category.Đồ_ăn;
		}else {
			return Category.Nước_uống;
		}
	}
	
	public static int inputNumber(Scanner scan) {
		int number = -1;
		do {
			try {
				number = Integer.parseInt(scan.nextLine());
			}catch (RuntimeException e) {
				System.out.println("Sai định dạng, mời nhập lại: ");
			}
		}while (number == -1);
		return number;
	}
	
	public void addProducts(int choice) {
		Product product = new Product();
		products.add(product);
	}
	
	public void repairProductById() {
		
	}
	
	public void delProductById(long id) {
		Product product = new Product();
		products.removeIf(p -> p.getId() == id);
	}
	
	public void printProductById(long id1) {
		for (Product pro : products) {
			if (pro.getId() == id1) {
				System.out.println(pro.toString());
			}
		}
	}
	
	public void printProduct() {
		for (Product pro : products) {
			System.out.println(pro.toString());
		}
	}
	
	public void printProductByCategory(int choice1) {
		if (choice1 == 1) {
			Category category = Category.Điện_tử;
			for (Product pro : products) {
				if (pro.getCategory().equals(category)) {
					System.out.println(pro.toString());
				}
			}
		}else if (choice1 == 2) {
			Category category = Category.Đồ_ăn;
			for (Product pro : products) {
				if (pro.getCategory().equals(category)) {
					System.out.println(pro.toString());
				}
			}
		}else {
			Category category = Category.Nước_uống;
			for (Product pro : products) {
				if (pro.getCategory().equals(category)) {
					System.out.println(pro.toString());
				}
			}
		}
		
	}
	
	public void sumPriceProduct() {
		int sum = 0;
		for (Product pro : products) {
			sum += pro.getPrice();
		}
		System.out.println("Tổng tiền tất cả các sản phẩm là: " + sum);
	}
	
	public void printProThan100000() {
		for (Product pro : products) {
			if (pro.getPrice() > 100000) {
				System.out.println(pro.toString());
			}
		}
	}
	
	public void printProThan200000() {
		for (Product pro : products) {
			if (pro.getPrice() > 200000 && pro.getCategory().equals(Category.Điện_tử)) {
				System.out.println(pro.toString());
			}
		}
	}
}



