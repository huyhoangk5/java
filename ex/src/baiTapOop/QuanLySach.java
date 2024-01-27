package baiTapOop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
	private static List<document> documentList = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	private static void menu() {
		System.out.println("Quản lý sách");
		System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
		System.out.println("2. Xoá tài liệu theo mã tài liệu");
		System.out.println("3. Hiện thị thông tin về tài liệu");
		System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo");
		System.out.println("5. Thoát");
		
	}
	
	public static void main(String[] args) {
		int choose;
		do {
			menu();
			choose = Integer.parseInt(scan.nextLine());
			switch(choose) {
			case 1:
				addDocument();
				break;
			case 2:
				deleteDocument();
				break;
			case 3:
				printDocumentList();
				break;
			case 4:
				searchDocument();
				break;
			case 5:
				System.out.println("Thoát");
			default:
				System.out.println("Vui lòng nhập lại lựa chọn");
				
			}
		}while(choose != 5);
	}
	
	private static void addDocument() {
		
	}
	
	private static void deleteDocument() {
		
	}
	
	private static void printDocumentList() {
		for(document doc : documentList) {
			System.out.println(doc);
		}
	}
	
	private static void searchDocument() {
		System.out.println("Nhập vào mã Sách, Tạp chí, Báo muốn tìm: ");
		long id = scan.nextLong();
		for(document doc : documentList) {
			if(doc.getId() == id) {
				System.out.println(doc);
				break;
			}
		}
		
	}
}