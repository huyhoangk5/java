package baiTapOop;

import java.util.Arrays;
import java.util.Scanner;

public class ProductManager {
	private Scanner scan;
	private Product[] list;
	private int index = 0;
	
	public ProductManager(Scanner scan) {
		super();
		list = new Product[0];
		this.scan = scan;
		
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
		Product[] newList = Arrays.copyOf(list, list.length + 1);
		newList[index] = newProduct(choice);
		list = newList;
		index++;
	}
	
	public void repairProductById() {
		
	}
	
	public void delProductById(long id) {
		Product[] newList = new Product[list.length - 1];
		for (int i = 0, j = 0; i < list.length -1; i++, j++) {
			if (list[i].getId() != id) {
				newList[i] = list[j];
			}else {
				j++;
				newList[i] = list[j];
			}
		}
		list = newList;
		index--;
	}
	
	public void printProductById(long id1) {
		for (Product pro : list) {
			if (pro.getId() == id1) {
				System.out.println(pro.toString());
			}
		}
	}
	
	public void printProduct() {
		for (Product pro : list) {
			System.out.println(pro.toString());
		}
	}
	
	public void printProductByCategory(int choice1) {
		if (choice1 == 1) {
			Category category = Category.Điện_tử;
			for (Product pro : list) {
				if (pro.getCategory().equals(category)) {
					System.out.println(pro.toString());
				}
			}
		}else if (choice1 == 2) {
			Category category = Category.Đồ_ăn;
			for (Product pro : list) {
				if (pro.getCategory().equals(category)) {
					System.out.println(pro.toString());
				}
			}
		}else {
			Category category = Category.Nước_uống;
			for (Product pro : list) {
				if (pro.getCategory().equals(category)) {
					System.out.println(pro.toString());
				}
			}
		}
		
	}
	
	public void sumPriceProduct() {
		int sum = 0;
		for (Product pro : list) {
			sum += pro.getPrice();
		}
		System.out.println("Tổng tiền tất cả các sản phẩm là: " + sum);
	}
	
	public void printProThan100000() {
		for (Product pro : list) {
			if (pro.getPrice() > 100000) {
				System.out.println(pro.toString());
			}
		}
	}
	
	public void printProThan200000() {
		for (Product pro : list) {
			if (pro.getPrice() > 200000 && pro.getCategory().equals(Category.Điện_tử)) {
				System.out.println(pro.toString());
			}
		}
	}
}



