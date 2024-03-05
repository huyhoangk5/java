package Case3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FootballerManager fm = new FootballerManager();
		int choice;
		
		do {
			System.out.println("Menu.");
			System.out.println("1. Thêm mới 1 cầu thủ.");
			System.out.println("2. Sửa thông tin cầu thủ theo id.");
			System.out.println("3. Xóa cầu thủ theo id.");
			System.out.println("4. Hiển thị tất cả cầu thủ.");
			System.out.println("5. Hiển thị cầu thủ theo số bàn thắng.");
			System.out.println("6. Hiển thị cầu thủ theo số trận tham gia.");
			System.out.println("7. Tìm kiếm cầu thủ theo tên gần đúng.");
			System.out.println("8. Hiển thị cầu thủ theo địa chỉ.");
			System.out.println("9. Hiển thị danh sách cầu thủ đã đóng quỹ/ chưa đóng quỹ.");
			System.out.println("10. Tổng số quỹ hiện tại.");
			System.out.println("11. Tổng số bàn thắng.");
			System.out.println("12. Xuất dánh sách.");
			System.out.println("0. Thoát.");
			System.out.println("Mời nhập vào lựa chọn: ");
			choice = FootballerManager.inputNumber(scan);
			
			switch (choice) {
			case 1:
				fm.addFootballers();
				break;
			case 2:
				System.out.println("Nhập vào id cầu thủ muốn cập nhật: ");
				long id1 = scan.nextLong();
				fm.updateFootballer(id1);
				break;
			case 3:
				System.out.println("Nhập vào id cầu thủ muốn xóa: ");
				long id2 = scan.nextLong();
				fm.deleteById(id2);
				break;
			case 4:
				fm.printAll();
				break;
			case 5:
				fm.printByGoal();
				break;
			case 6:
				fm.printByMatch();
				break;
			case 7:
				System.out.println("Nhập tên cầu thủ muốn tìm: ");
				String name = scan.nextLine();
				fm.searchByName(name);
				break;
			case 8:
				System.out.println("1. Hà Nội.");
				System.out.println("2. Sài Gòn.");
				System.out.println("3. Nam Định.");
				System.out.println("Mời nhập lựa chọn: ");
				int choice1 = FootballerManager.inputNumber(scan);
				fm.printByAddress(choice1);
				break;
			case 9:
				fm.printByMoney();
				break;
			case 10:
				fm.sumMoney();
				break;
			case 11:
				fm.sumGoal();
				break;
			case 12:
				fm.write();
				break;
			case 0:
				System.out.println("Thoát chương trình.");
			}
		}while (choice != 0);
	}
}
