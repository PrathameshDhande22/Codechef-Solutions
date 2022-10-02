package codechef;

import java.util.Scanner;

public class AVOIDCONTACT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==y) {
				System.out.println((y*2)-1);
			}
			else {
				System.out.println((y*2)+(x-y));
			}
		}
		sc.close();
	}

}
/*
3
4 0
5 3
3 3

*/