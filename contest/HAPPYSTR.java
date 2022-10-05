package codechef.contest;

import java.util.Scanner;

public class HAPPYSTR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			String s=sc.next();
			System.out.println(mood(s));
		}
		sc.close();
	}
	public static String mood(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char scon=s.charAt(i);
			if(scon=='a' || scon=='e'||scon=='i'||scon=='o'||scon=='u') {
				count++;
			}
			else {
				count=0;
			}
			if(count==3) {
				return "Happy";
			}
	
		}
		return "Sad";
	}

}
