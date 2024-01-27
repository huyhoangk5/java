package baiTapOop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	private static List<CanBo> canBoList = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
//    private static int choice;
    
    public static void menu() {
        System.out.println("Quản lý cán bộ");
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm cán bộ theo tên");
        System.out.println("3. Hiển thị danh sách cán bộ");
        System.out.println("4. Thoát");
        System.out.println("Nhập vào lựa chọn của bạn: ");
    }
    public static void main(String[] args) {
        int choose;
        do {
            menu();
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    addCanBo();
                    break;
                case 2:
                    searchCanBo();
                    break;
                case 3:
                    printCanBoList();
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn");
            }
        } while (choose != 4);
    }
    
    public CanBo addCanBo(int choice) {
    	CanBo cb;
        System.out.println("Nhập thông tin cán bộ");
        System.out.print("Họ tên: ");
        String name = scan.nextLine();
        System.out.print("Tuổi: ");
        int age = Integer.parseInt(scan.nextLine());
        String gender = choiceGender();
        System.out.print("Địa chỉ: ");
        String address = scan.nextLine();
        
        if (choice == 1) {
			System.out.println("Nhập ngành đào tạo: ");
			String special = scan.nextLine();
			cb = new KySu(name, age, gender, address, special);
		} else if (choice == 2) {
			System.out.println("Nhập bậc: ");
			int rank = scan.nextInt();
			cb = new CongNhan(name, age, gender, address, rank);
		} else {
			System.out.println("Nhập công việc: ");
			String work = scan.nextLine();
			cb = new NhanVien(name, age, gender, address, work);
		}
		return cb;
		
    }
    
//    public List<CanBo> themCanBo() {
//    	for (CanBo cb : canBoList) {
//    		canBoList.add(cb);
//    	}
//    }
    
    private String choiceGender() {
		System.out.println("Chọn giới tính: ");
		System.out.println("1. Nam");
		System.out.println("2. Nữ");
		System.out.println("3. Khác");
		System.out.println("Nhập lựa chọn: ");
		int choiceGender = Integer.parseInt(scan.nextLine());
		if (choiceGender == 1) {
			return "Nam";
		} else if (choiceGender == 2) {
			return "Nữ";
		} else {
			return "Khác";
		}
	}
    
    public static void searchCanBo() {
        System.out.print("Nhập vào tên cán bộ cần tìm: ");
        String name = scan.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.getName().equals(name)) {
                System.out.println(canBo);
                break;
            }
        }
    }
    public static void printCanBoList() {
    	for (CanBo cb : canBoList) {
    		canBoList.add(cb);
			if (cb != null) {
				System.out.println(cb.toString());
			}
		}
    }
}
