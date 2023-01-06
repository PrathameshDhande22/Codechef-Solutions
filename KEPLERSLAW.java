package codechef;

import java.util.Scanner;

public class KEPLERSLAW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			int t1=sc.nextInt();
			int t2=sc.nextInt();
			int r1=sc.nextInt();
			int r2=sc.nextInt();
			System.out.println(checkKeplerslaw(t1,t2,r1,r2));
		}
		sc.close();
	}

	private static String checkKeplerslaw(int t1, int t2, int r1, int r2) {
		double cal1=Math.pow(t1,2)/Math.pow(r1, 3);
		double cal2=Math.pow(t2,2)/Math.pow(r2, 3);
		if(cal1==cal2) {
			return "yes";
		}
		else
			return "No";
		
	}

}
