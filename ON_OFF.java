package codechef;

import java.util.Scanner;

public class ON_OFF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
//		int count = 0;
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			int count=0;
			int n = sc.nextInt();
			String s = sc.next();
			sc.nextLine();
			String r = sc.next();
			for (int j = 0; i < n; i++) {
				if (s.charAt(j) != r.charAt(j)) {
					count++;
				}
			}
			if(count%2==0) {
				System.out.println("1");
			}
			else
				System.out.println("0");

		}
		sc.close();
		

	}
}
/*
2
3
000
001
2
00
11
*/