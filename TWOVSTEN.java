package codechef;

import java.util.Scanner;

public class TWOVSTEN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int x = sc.nextInt();
			if (x % 10 == 0) {
				System.out.println(0);
			}
			else if(x%10==5) {
				System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
			
		}
		sc.close();

	}

}

/*
 * 
 * 
 * 3
10
25
1
 */
