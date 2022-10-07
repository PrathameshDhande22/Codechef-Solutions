package codechef;

import java.util.Scanner;

public class BURGERS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int patties = sc.nextInt();
			int bun = sc.nextInt();
			System.out.println(Math.min(patties, bun));
		}
		sc.close();
	}

}
