package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class OFFICE {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int x,y;
		int cases=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String [] inputs=sc.nextLine().split(" ");
			x=Integer.parseInt(inputs[0]);
			y=Integer.parseInt(inputs[1]);
			ans.add(x*4+y);
		}
		sc.close();
		for(int a:ans) {
			System.out.println(a);
		}
	}

}
