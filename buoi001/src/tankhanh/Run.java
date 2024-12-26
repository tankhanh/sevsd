package tankhanh;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean flag = true;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Chọn true/false? ");
//		flag = sc.nextBoolean();
		
//		if(flag==true) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
//		System.out.println(flag?"true":"false");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		int n = sc.nextInt();
//		old java
		switch(n) {
		case 1:
			System.out.println("Một");
			System.out.println("Một");
			break;
		case 2:
			System.out.println("Hai");
			break;
		case 3:
			System.out.println("Ba");
			break;
		default:
			System.out.println("error");
			break;
		}
		
//		new java
		switch(n) {
		case 1-> {
			System.out.println("Một");
			System.out.println("Một");
		}
		case 2-> System.out.println("Hai");
		case 3-> System.out.println("Ba");
		default-> System.out.println("error");
		}
		
		sc.close();
	}

}
