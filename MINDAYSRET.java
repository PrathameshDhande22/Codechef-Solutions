package codechef;

import java.util.Scanner;

public class MINDAYSRET {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int days=n/k;
			if(n%k==0) {
				System.out.println(days);
			}
			else {
				System.out.println(days+1);
			}
		}
		sc.close();
		
	}

}
