package codechef;

import java.util.Scanner;

public class PSGRADE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int amin=sc.nextInt();
			int bmin=sc.nextInt();
			int cmin=sc.nextInt();
			int tmin=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if((amin<=a)&&(bmin<=b)&(cmin<=c)&&((a+b+c)>=tmin)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}

/*
 * 
5
1 1 1 300 2 2 2
3 2 2 6 2 2 2
2 3 2 6 2 2 2
2 2 3 6 2 2 2
100 100 100 300 100 100 100

 * 
 * 
 * 
 */
