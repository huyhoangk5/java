package Case3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FootballerManager {
	private Scanner scan = new Scanner(System.in);
	private List<Footballer> fbs;
	private String path = "C:\\Users\\Administrator\\eclipse-workspace\\ex\\src\\Case3\\";
	private File file = new File(path + "case3.txt");
	
	public FootballerManager() {
		this.fbs = new ArrayList<>();
	}
		
//	public Footballer newFootballer() {
//		Footballer fb;
//		System.out.println("Nhập vào tên của cầu thủ: ");
//		String name = scan.nextLine();
//		System.out.println("Nhập vào id của cầu thủ: ");
//		long id = scan.nextLong();
//		System.out.println("Nhập vào tuổi của cầu thủ: ");
//		int age = scan.nextInt();
//		//chọn giới tính
//		String sex = choiceSex();
//		//chọn địa chỉ
//		String address = choiceAddress();
//		System.out.println("Nhập vào số bàn thắng của cầu thủ: ");
//		int goal = scan.nextInt();
//		System.out.println("Nhập vào số trận tham gia của cầu thủ: ");
//		int match = scan.nextInt();
//		//chọn đóng quỹ
//		String money = choiceMoney();
//		fb = new Footballer(id, name, age, sex, address, goal, match, money);
//		return fb;
//	}
	
	private String choiceSex() {
		System.out.println("Chọn giới tính.");
		System.out.println("1. Nam");
		System.out.println("2. Nữ");
		System.out.println("3. khác");
		System.out.println("Mời nhập lựa chọn: ");
		int choiceSex = scan.nextInt();
		
		if (choiceSex == 1) {
			return "Nam";
		} else if (choiceSex == 2) {
			return "Nữ";
		}else {
			return "Khác";
		}
	}
	
	private String choiceAddress() {
		System.out.println("Chọn địa chỉ.");
		System.out.println("1. Hà Nội");
		System.out.println("2. Sài Gòn");
		System.out.println("3. Nam Định");
		System.out.println("Mời nhập lựa chọn: ");
		int choiceAddress = scan.nextInt();
		
		if (choiceAddress == 1) {
			return "Hà Nội";
		} else if (choiceAddress == 2) {
			return "Sài Gòn";
		}else {
			return "Nam Định";
		}
	}
	
	private String choiceMoney() {
		System.out.println("Đã đóng quỹ chưa?");
		System.out.println("1. Đã đóng");
		System.out.println("2. Chưa đóng");
		System.out.println("Mời nhập lựa chọn: ");
		int choiceMoney = scan.nextInt();
		
		if (choiceMoney == 1) {
			return "Đã đóng";
		}else if (choiceMoney == 2) {
			return "Chưa đóng";
		}else {
			return null;
		}
	}
	
	public List<Footballer> addFootballers() {
		Footballer fb;
		System.out.println("Nhập vào tên của cầu thủ: ");
		String name = scan.nextLine();
		System.out.println("Nhập vào id của cầu thủ: ");
		long id = scan.nextLong();
		System.out.println("Nhập vào tuổi của cầu thủ: ");
		int age = scan.nextInt();
		//chọn giới tính
		String sex = choiceSex();
		//chọn địa chỉ
		String address = choiceAddress();
		System.out.println("Nhập vào số bàn thắng của cầu thủ: ");
		int goal = scan.nextInt();
		System.out.println("Nhập vào số trận tham gia của cầu thủ: ");
		int match = scan.nextInt();
		//chọn đóng quỹ
		String money = choiceMoney();
		fb = new Footballer(id, name, age, sex, address, goal, match, money);
		fbs.add(fb);
		return fbs;
	}
	
	public static int inputNumber(Scanner scan) {
		int number = -1;
		do {
			try {
				number = Integer.parseInt(scan.nextLine());
			}catch (RuntimeException e) {
				System.out.println("Nhập sai, mời nhập lại: ");
			}
		}while (number == -1);
		return number;
	}
	
	public void updateFootballer(long id) {
		Footballer newFb;
		for (Footballer fb : fbs) {
			if (fb.getId() == id) {
				System.out.println("Nhập thông tin cập nhật.");
				System.out.println("Nhập vào tên của cầu thủ: ");
				String newName = scan.nextLine();
				System.out.println("Nhập vào id của cầu thủ: ");
				long newId = scan.nextLong();				
				System.out.println("Nhập vào tuổi của cầu thủ: ");
				int newAge = scan.nextInt();
				String newSex = choiceSex();
				String newAddress = choiceAddress();
				System.out.println("Nhập vào số bàn thắng của cầu thủ: ");
				int newGoal = scan.nextInt();
				System.out.println("Nhập vào số trận tham gia của cầu thủ: ");
				int newMatch = scan.nextInt();
				String newMoney = choiceMoney();
				newFb = new Footballer(newId, newName, newAge, newSex, newAddress, newGoal, newMatch, newMoney); 
				fbs.add(newFb);
			} else if (fb.getId() != id){
				System.out.println("Id không tồn tại.");
			}
		}
	}
	
	public void deleteById(long id) {
		fbs.removeIf(fb -> fb.getId() == id);
	}
	
	public void printAll() {
		for (Footballer fb : fbs) {
			System.out.println(fb.toString());
		}
	}
	
	public void printByGoal() {
		Collections.sort(fbs, new Comparator<Footballer> () {

			@Override
			public int compare(Footballer o1, Footballer o2) {
				if (o1.getGoal() > o2.getGoal()) {
					return -1;
				} else if (o1.getGoal() < o2.getGoal()) {
					return 1;
				} else {
					return 0;
				}
			}	
		});
		for (Footballer fb : fbs) {
			System.out.println(fb);
		}
	}
	
	public void printByMatch() {
		Collections.sort(fbs, new Comparator<Footballer> () {

			@Override
			public int compare(Footballer o1, Footballer o2) {
				if (o1.getMatch() > o2.getMatch()) {
					return -1;
				} else if (o1.getMatch() < o2.getMatch()) {
					return 1;
				} else {
					return 0;
				}
			}	
		});
		for (Footballer fb : fbs) {
			System.out.println(fb);
		}
	}
	
	public void searchByName(String name) {
		for (Footballer fb : fbs) {
			if (fb.getName().contains(name)) {
				System.out.println(fb.toString());
			}
		}
	}
	
	public void printByAddress(int choice) {
		if (choice == 1) {
			String address = "Hà Nội";
			for (Footballer fb : fbs) {
				if (fb.getAddress().equals(address)) {
					System.out.println(fb.toString());
				}
			}
		} else if(choice == 2) {
			String address = "Sài Gòn";
			for (Footballer fb : fbs) {
				if (fb.getAddress().equals(address)) {
					System.out.println(fb.toString());
				}
			}
		} else if (choice == 3) {
			String address = "Nam Định";
			for (Footballer fb : fbs) {
				if (fb.getAddress().equals(address)) {
					System.out.println(fb.toString());
				}
			}
		} else {
			System.out.println("Không có cầu thủ nào.");
		}
	}
	
	public void printByMoney() {
		for (Footballer fb : fbs) {
			if (fb.getMoney().equals("Đã đóng")){
				System.out.println(fb.toString());
			}
		}
		for (Footballer fb : fbs) {
			if (fb.getMoney().equals("Chưa đóng")){
				System.out.println(fb.toString());
			}
		}
	}
	
	public void sumMoney() {
		int sumMoney = 0;
		for (Footballer fb : fbs) {
			if (fb.getMoney().equals("Đã đóng")){
				sumMoney += 500000;
			}
		}
		System.out.println("Tổng số quỹ hiện tại là: " + sumMoney);
	}
	
	public void sumGoal() {
		int sumGoal = 0;
		for (Footballer fb : fbs) {
			sumGoal += fb.getGoal();
		}
		System.out.println("Tổng số bàn thắng là: " + sumGoal);
	}
	
	public void write() {
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(fbs + "\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
