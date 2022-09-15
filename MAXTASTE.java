package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MAXTASTE {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();
		ArrayList<Integer> d = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] split_in = sc.nextLine().split(" ");
			a.add(Integer.parseInt(split_in[0]));
			b.add(Integer.parseInt(split_in[1]));
			c.add(Integer.parseInt(split_in[2]));
			d.add(Integer.parseInt(split_in[3]));

		}

		sc.close();
		for (int i = 0; i < cases; i++) {
			System.out.println(getTastiness(a.get(i), b.get(i), c.get(i), d.get(i)));
		}

	}
	
	public static int getTastiness(int a,int b,int c,int d) {
		return max(a+c,a+d,b+c,b+d);
		
	}

	public static int max(int a,int b,int c,int d) {
		ArrayList<Integer> getmax=new ArrayList<>();
		getmax.add(a);
		getmax.add(b);
		getmax.add(c);
		getmax.add(d);
		return Collections.max(getmax);
	}

}
