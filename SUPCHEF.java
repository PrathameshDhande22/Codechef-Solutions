package codechef;

import java.util.Scanner;

public class SUPCHEF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			int k=sc.nextInt();
			if((n*k)<m) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		sc.close();
	}

}
