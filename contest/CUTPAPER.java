package codechef.contest;

import java.util.Scanner;

public class CUTPAPER {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int temp = n / k;
			System.out.println(temp * temp);
		}
		sc.close();
	}

}
