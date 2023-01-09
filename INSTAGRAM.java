package codechef;

import java.util.Scanner;

public class INSTAGRAM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int following = sc.nextInt();
			int follower = sc.nextInt();
			if (following > 10 * follower) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}
		sc.close();
	}

}
