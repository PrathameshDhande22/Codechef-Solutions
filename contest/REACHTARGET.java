package codechef.contest;

import java.util.Scanner;

public class REACHTARGET {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x-y);
		}
		sc.close();
	}

}
