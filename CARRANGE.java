package codechef;

import java.util.Scanner;

public class CARRANGE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int p=sc.nextInt();
			int m=sc.nextInt();
			int v=sc.nextInt();
			System.out.println((m-(p-1))*v);
		}
		sc.close();
	}

}
