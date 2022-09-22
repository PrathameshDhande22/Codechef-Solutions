package codechef.contest;

import java.util.Scanner;

public class SUMNEQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pair=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n) {
					pair++;
				}
			}
		}
		sc.close();
		System.out.println(pair);
	}

}
