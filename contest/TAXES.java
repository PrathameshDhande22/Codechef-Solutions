package codechef.contest;

import java.util.Scanner;

public class TAXES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int x = sc.nextInt();
			System.out.println((x > 100) ? (x - 10) : x);
		}
		sc.close();
	}

}
