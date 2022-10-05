package codechef.contest;

import java.util.Scanner;

public class AUDIBLE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int x = sc.nextInt();
			if (x >= 67 && x <= 45000) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
