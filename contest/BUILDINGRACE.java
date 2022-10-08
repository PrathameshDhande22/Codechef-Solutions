package codechef.contest;

import java.util.Scanner;

public class BUILDINGRACE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			float a = sc.nextInt();
			float b = sc.nextInt();
			float x = sc.nextInt();
			float y = sc.nextInt();
			if ((a / x) > (b / y)) {
				System.out.println("Chefina");
			} else if ((a / x) < (b / y)) {
				System.out.println("Chef");
			} else {
				System.out.println("Both");
			}
		}
		sc.close();
	}

}
