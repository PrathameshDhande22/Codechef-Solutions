package codechef.contest;

import java.util.Scanner;

public class EXPERT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			float x = sc.nextInt();
			float y = sc.nextInt();
			float per = (float) (y / x) * 100;
//			System.out.println(per);
			if (per >= 50) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
