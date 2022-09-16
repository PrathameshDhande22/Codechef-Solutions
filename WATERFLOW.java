package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class WATERFLOW {

	public static void main(String[] args) {
		ArrayList<Integer> w = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Integer> z = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] split_in = sc.nextLine().split(" ");
			w.add(Integer.parseInt(split_in[0]));
			x.add(Integer.parseInt(split_in[1]));
			y.add(Integer.parseInt(split_in[2]));
			z.add(Integer.parseInt(split_in[3]));
		}

		sc.close();
		for(int i=0;i<cases;i++) {
			System.out.println(getBucketDetails(w.get(i), x.get(i), y.get(i), z.get(i)));
		}
	}
	
	public static String getBucketDetails(int w,int x,int y,int z) {
		int ans=w+(y*z);
		if(ans<x) {
			return "Unfilled";
		}
		else if(ans>x) {
			return "Overflow";
		}
		else 
			return "Filled";
	}

}
