package baiTapOop.bai3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductManager pm = new ProductManager();
		int choice;

		do {
			System.out.println("Menu");
			System.out.println("1. Tạo mới 1 Product.");
			System.out.println("2. Sửa 1 Product theo id.");
			System.out.println("3. Xóa 1 Product theo id.");
			System.out.println("4. Hiển thị 1 product theo id.");
			System.out.println("5. Hiển thị tất cả Product.");
			System.out.println("6. Hiển thị tất cả Product theo 1 Category.");
			System.out.println("7. Tính tổng tiền tất cả các Product hiện có.");
			System.out.println("8. Hiển thị tất cả Product có giá tiền trên 100000.");
			System.out.println("9. Hiển thị tất cả Product có giá tiền trên 200000 và thuộc Category 'Điện tử'.");
			System.out.println("0. Thoát.");
			System.out.println("Mời nhập vào lựa chọn: ");
			choice = ProductManager.inputNumber(scan);
			switch (choice) {
			case 1:
				System.out.println("Category: 1. Điện tử");
				System.out.println("Category: 2. Đồ ăn");
				System.out.println("Category: 3. Nước uống");
				System.out.println("Nhập vào lựa chọn: ");
				choice = ProductManager.inputNumber(scan);
				pm.newProduct(choice);
				break;
			case 2:
				System.out.println("Nhập vào id của Product muốn sửa: ");
				pm.repairProductById();
				break;
			case 3:
				System.out.println("Nhập vào id của product muốn xóa: ");
				long id = scan.nextLong();
				pm.delProductById(id);
				break;
			case 4:
				System.out.println("Nhập id sản phẩm muốn xem: ");
				long id1 = scan.nextLong();
				pm.printProductById(id1);
				break;
			case 5:
				pm.printProduct();
				break;
			case 6:
				System.out.println("1. Điện tử");
				System.out.println("2. Đồ ăn");
				System.out.println("3. Nước uống");
				System.out.println("Nhập vào Category muốn hiển thị: ");
				int choice1 = ProductManager.inputNumber(scan);
				pm.printProductByCategory(choice1);
				break;
			case 7:
				pm.sumPriceProduct();
				break;
			case 8:
				pm.printProThan100000();
				break;
			case 9:
				pm.printProThan200000();
				break;
			case 0:
				System.out.println("Thoát chương trình.");
			}
		} while (choice != 0);
	}
	
//	public static void addProduct(Scanner scan, ProductManager pm) {
//		System.out.println("Chọn Category");
//		System.out.println("1. Điện tử");
//		System.out.println("2. Đồ ăn");
//		System.out.println("3. Nước uống");
//		System.out.println("Nhập vào lựa chọn: ");
//		int choiceCategory1 = ProductManager.inputNumber(scan);
//	}
//	enum Category{
//		Điện_tử,
//		Đồ_ăn,
//		Nước_uống
//	}
//	Category category1 = Category.Điện_tử;
//	Category category2 = Category.Đồ_ăn;
//	Category category3 = Category.Nước_uống;
//	
//	public static Category choiceCategory() {
//		Scanner scan = new Scanner(System.in);
//		Scanner scan1 = new Scanner(System.in);
//		ProductManager pm = new ProductManager(scan1);
//		System.out.println("Chọn Category");
//		System.out.println("1. Điện tử");
//		System.out.println("2. Đồ ăn");
//		System.out.println("3. Nước uống");
//		System.out.println("Nhập vào lựa chọn: ");
//		int choiceCategory = pm.inputNumber(scan);
//		if (choiceCategory == 1) {
//			return Category.Điện_tử;
//		}else if (choiceCategory == 2) {
//			return Category.Đồ_ăn;
//		}else {
//			return Category.Nước_uống;
//		}
//	}
}
