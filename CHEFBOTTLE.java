package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CHEFBOTTLE {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n,x,k;
		int cases=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String [] inputs=sc.nextLine().split(" ");
			n=Integer.parseInt(inputs[0]);
			x=Integer.parseInt(inputs[1]);
			k=Integer.parseInt(inputs[2]);
			if((k/x)<n) {
				ans.add(k/x);
			}
			else if((k/x)>=n) {
				ans.add(n);
			}
		}
		sc.close();
		for(int a:ans) {
			System.out.println(a);
		}
	}

}
