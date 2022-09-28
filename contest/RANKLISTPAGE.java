package codechef.contest;

import java.util.Scanner;

public class RANKLISTPAGE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int x=sc.nextInt();
			if(x%25==0) {
				System.out.println(x/25);
			}
			else {
				System.out.println((x/25)+1);
			}
		}
		sc.close();
	}

}
