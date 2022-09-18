package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HDIVISR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ans=new ArrayList<>();
		int no=sc.nextInt();
		for(int i=1;i<=10;i++) {
			if(no%i==0){
				ans.add(i);
			}
		}
		sc.close();
		System.out.println(Collections.max(ans));
	}

}
