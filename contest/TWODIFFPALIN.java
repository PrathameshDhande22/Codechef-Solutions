package codechef.contest;

import java.util.Scanner;

public class TWODIFFPALIN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(((a%2)!=0) &&((b%2)!=0) ||a==1||b==1){
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
		}
		sc.close();

	}

}
