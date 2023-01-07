package codechef;

import java.util.Scanner;

public class WEIGHTBL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int w1 = sc.nextInt();
			int w2 = sc.nextInt();
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int M = sc.nextInt();
			System.out.println(faulty(w1, w2, M, x1, x2));
		}
		sc.close();
	}

	public static int faulty(int w1, int w2, int M, int x1, int x2) {
		int actualWeight = w2 - w1;

		if ((x1 * M) <= actualWeight && (x2 * M) >= actualWeight) {
			return 1;
		} else
			return 0;
	}

}
