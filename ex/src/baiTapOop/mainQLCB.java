package baiTapOop;

import java.util.Scanner;

public class mainQLCB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		int choice;
		do {
			qlcb.menu();
			choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Chọn vị trí muốn tạo: ");
				System.out.println("1. Kỹ sư");
				System.out.println("2. Công nhân");
				System.out.println("3. Nhân viên");
				System.out.println("Nhập lựa chọn của bạn: ");
				int choice1 = Integer.parseInt(scanner.nextLine());
				qlcb.addCanBo(choice1);
				break;
			case 2:
				qlcb.searchCanBo();
				break;
			case 3:
				qlcb.printCanBoList();
				break;
			}
		} while (choice != 4);
	}

}