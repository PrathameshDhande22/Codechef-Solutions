package codechef;

import java.util.Scanner;

public class INTEST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(a%k==0) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}

}
