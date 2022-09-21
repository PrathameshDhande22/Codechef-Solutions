package codechef;

import java.util.Scanner;

class SAVWATER {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int h=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int c=sc.nextInt();
			System.out.println(requires(h, x, y, c));
		}
		sc.close();

	}
	public static String requires(int h,int x,int y,int c) {
		int rem=(int)x+(y/2);
		int hold=h*rem;
		if(hold<=c) {
			return "Yes";		
		}
		else
			return "No";
	}
}
