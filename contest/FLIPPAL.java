package codechef.contest;

import java.util.Scanner;

public class FLIPPAL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			int zc = 0, oc = 0;
			char[] s = sc.next().toCharArray();
			for (int a = 0; a < n; a++) {
				if (s[a] == '0') {
					zc++;
				} else {
					oc++;
				}
			}
			if (zc % 2 == 0 || oc % 2 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
		sc.close();
	}

}
