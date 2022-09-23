package codechef;

import java.util.Scanner;

public class EQLZING {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			boolean equal=false;
			for(int j=0;j<1000;j++) {
				if(a==b) {
					equal=true;
					break;
				}
				else if((j+a)==(b-j)) {
					equal=true;
					break;
				}
				else if((j+b)==(a-j)) {
					equal=true;
					break;
				}
			}
			if(equal) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		sc.close();
	}

}
