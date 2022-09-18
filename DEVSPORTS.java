package codechef;

import java.util.Scanner;

public class DEVSPORTS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int z=sc.nextInt();
			int y=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if (canTry(z-y,a+b+c)) {
				System.out.println("Yes");
		}
			else
				System.out.println("No");
		}	
		sc.close();

	}
	public static boolean canTry(int rem,int tot) {
		if(tot<=rem) {
			return true;
		}
		else
			return false;
	}

}

/*
 * 3
25000 22000 1000 1500 700
10000 7000 100 300 500
15000 5000 2000 5000 3000*/
