package codechef;

import java.util.Scanner;

public class OLYRANK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			int g1 = sc.nextInt();
			int s1 = sc.nextInt();
			int b1 = sc.nextInt();
			int g2 = sc.nextInt();
			int s2 = sc.nextInt();
			int b2 = sc.nextInt();
			int total_countries_1 = g1 + s1 + b1;
			int total_countries_2 = g2 + s2 + b2;
			System.out.println((total_countries_1 < total_countries_2 ? 2 : 1));
		}
		sc.close();
	}

}
