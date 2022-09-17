package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class LOOP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ans=new ArrayList<>();
		int cases=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String [] in=sc.nextLine().split(" ");
			ans.add(getDistance(Integer.parseInt(in[0]), Integer.parseInt(in[1]),Integer.parseInt(in[2])));
		}
		sc.close();
		for(int e:ans) {
			System.out.println(e);
		}

	}
	public static int getDistance(int x,int y,int m) {
		int dista=Math.abs(x-y);
		int distb=Math.abs(dista-m);
		return Math.min(dista,distb);
	}

}
