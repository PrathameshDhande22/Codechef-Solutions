package codechef;

import java.util.Scanner;

public class VDATES {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int d=sc.nextInt();
			int l=sc.nextInt();
			int r=sc.nextInt();
			if(d>=l && d<=r) {
				System.out.println("Take Second Dose Now");
			}
			else if(d<l) {
				System.out.println("Too Early");
			}
			else if(d>r){
				System.out.println("Too Late");
			}
			
		}
		sc.close();
	}

}
/*
4
10 8 12 
14 2 10
4444 5555 6666 
8 8 12


*/