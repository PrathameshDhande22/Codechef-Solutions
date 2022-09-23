package codechef.contest;

import java.util.Scanner;

public class SLEEP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int x = sc.nextInt();
			if (x >= 7) {
				System.out.println("No");
			} else
				System.out.println("Yes");
		}
		sc.close();
	}

}
