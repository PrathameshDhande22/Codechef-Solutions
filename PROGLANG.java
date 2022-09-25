package codechef;

import java.util.Scanner;

public class PROGLANG {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int a1=sc.nextInt();
			int b1=sc.nextInt();
			int a2=sc.nextInt();
			int b2=sc.nextInt();
			if(((a==a1)||(a==b1))&& ((b==a1)||(b==b1))) {
				System.out.println(1);
			}
			else if(((a==a2)||(a==b2))&&((b==a2)||(b==b2))) {
				System.out.println(2);
			}
			else {
				System.out.println(0);
			}
		}
		sc.close();
	}

}/*
3
1 2 2 1 3 4
3 4 2 1 4 3
1 2 1 3 2 4
*/
