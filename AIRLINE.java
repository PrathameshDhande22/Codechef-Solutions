package codechef;

import java.util.Scanner;

public class AIRLINE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			if (((a + b) <= d && c <= e) || ((a + c) <= d && b <= e) || ((b + c) <= d && a <= e)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
