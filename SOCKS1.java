package codechef;

import java.util.Scanner;

public class SOCKS1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if((a==b)||(b==c)||(a==c)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");

	}

}
