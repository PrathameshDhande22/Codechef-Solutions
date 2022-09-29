package codechef;

import java.util.Scanner;

public class UWCOI21A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println(2+" "+n/2);
			}
			else {
				System.out.println(1+" "+n);
			}
		}
		sc.close();
	}

}

/**
 * 
 * 5
1
3
5
8
10
 * 
 */
