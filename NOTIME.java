package codechef;

import java.util.Scanner;

public class NOTIME {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []timezone=new int[n];
		int h=sc.nextInt();
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			timezone[i]=sc.nextInt();
		}
		if(canSolve(timezone, n, h, x)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		sc.close();
	}
	
	public static boolean canSolve(int timezone[],int n,int h,int x) {
		for(int i=0;i<n;i++) {
			if(timezone[i]+x>=h) {
				return true;
			}
		}
		return false;
	}

}
/*
 * 
2 5 3
1 2

2 6 3
1 2
 * 
 * 
 */
