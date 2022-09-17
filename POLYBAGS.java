package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class POLYBAGS {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int cases =sc.nextInt();
		for(int i=0;i<cases;i++) {
			int no=sc.nextInt();
			ans.add(getRequiredPolybags(no));
		}
		sc.close();
		for(int e:ans) {
			System.out.println(e);
		}
	}
	public static int getRequiredPolybags(int x) {
		if(x%10==0) {
			return x/10;
		}
		else
			return (x/10)+1;

	}

}
