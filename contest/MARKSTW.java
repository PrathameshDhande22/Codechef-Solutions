package codechef.contest;

import java.util.Scanner;

public class MARKSTW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>=2*y) {
			System.out.println("yes");
		}
		else
			System.out.println("No");
		sc.close();
	}

}
