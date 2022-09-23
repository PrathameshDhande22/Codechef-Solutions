package codechef.contest;

import java.util.Scanner;

public class EQUALIZEAB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=sc.nextInt();
			if(a==b) {
				System.out.println("Yes");
			}
			else if((Math.abs(a-b)%(x*2))==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}

/*
 * 
 * 4
5 7 1
3 4 2
4 4 6
2 5 3
 * 
 */
