package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CHFSPL {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			ans.add(a+b);
			ans.add(b+c);
			ans.add(a+c);
			System.out.println(Collections.max(ans));
			ans.clear();
		}
		sc.close();

	}

}
