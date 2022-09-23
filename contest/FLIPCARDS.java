package codechef.contest;

import java.util.Scanner;

public class FLIPCARDS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			System.out.println(Math.min(n-x, x));
		}
		sc.close();
	}

}

/*
 * 4
5 0
4 2
3 3
10 2
 */
