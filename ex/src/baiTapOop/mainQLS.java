package baiTapOop;

import java.util.Scanner;

public class mainQLS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	QuanLySach qls = new QuanLySach();
	int choice;
	do {
		qls.menu();
		choice = Integer.parseInt(scan.nextLine());
		switch (choice) {
		case 1:
			int choice1 = Integer.parseInt(scan.nextLine());
			qls.addDocument(choice1);
			break;
		case 2:
			qls.deleteDocument();
			break;
		case 3:
			qls.printDocumentList();
			break;
		}
	} while (choice != 4);
	}
}