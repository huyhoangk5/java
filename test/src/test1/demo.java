package test1;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào x: ");
		float x = scan.nextFloat();
		System.out.println("Nhập vào y: ");
		float y = scan.nextFloat();
		System.out.println("Nhập vào z: ");
		float z = scan.nextFloat();
		float max1 = x > y ? x : y;
		float max = max1 > z ? max1 : z;
		System.out.println(max);
	}
}
