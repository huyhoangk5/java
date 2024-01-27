package baiTapOop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
	private static List<document> documentList = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void menu() {
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
	
	public document addDocument(int choice) {
		document doc;
		System.out.println("Nhập thông tin tài liệu");
		System.out.println("Mã sản phẩm: ");
		long id = scan.nextLong();
		System.out.println("Tên nhà xuất bản: ");
		String imprint = scan.nextLine();
		System.out.println("Số bản phát hành: ");
		long issue = scan.nextLong();
		
		if (choice == 1) {
			System.out.println("Nhập tên tác giả: ");
			String author = scan.nextLine();
			System.out.println("Nhập vào sôs trang: ");
			long page = scan.nextLong();
			doc = new book(id, imprint, issue, author, page);
		} else if (choice == 2) {
			System.out.println("Nhập vào số phát hành: ");
			int ordinalNumber = scan.nextInt();
			System.out.println("Nhập vào tháng phát hành: ");
			int month = scan.nextInt();
			doc = new magazine(id, imprint, issue, ordinalNumber, month);
		}else {
			System.out.println("Nhập vào ngày phát hành: ");
			int day = scan.nextInt();
			doc = new news(id, imprint, issue, day);
		}
		return doc;
	}
	
	public static void deleteDocument() {
		System.out.println("Nhập mã tài liệu muốn xóa: ");
		long id = scan.nextLong();
		for  (document doc : documentList) {
			if(doc.getId() == id) {
				documentList.remove(doc);
			}
		}
	}
	
	public static void printDocumentList() {
		for(document doc : documentList) {
			documentList.add(doc);
			if (doc != null) {
				System.out.println(doc.toString());
			}
		}
	}
	
	public static void searchDocument() {
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
