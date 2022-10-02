package codechef;

import java.util.Scanner;

public class REMISS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a<=b) {
				System.out.println(b+" "+(a+b));
			}
			else {
				System.out.println(a+" "+(a+b));
			}
		}
		sc.close();
	}

}
