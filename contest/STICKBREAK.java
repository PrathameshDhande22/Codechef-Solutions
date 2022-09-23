package codechef.contest;

import java.util.Scanner;

public class STICKBREAK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int k=sc.nextInt();
			int x=sc.nextInt();
			if(k%x==1) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		sc.close();
	}

}
