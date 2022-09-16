package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class FILLCANDIES {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<Integer> k = new ArrayList<>();
		ArrayList<Integer> m = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			n.add(Integer.parseInt(split_in[0]));
			k.add(Integer.parseInt(split_in[1]));
			m.add(Integer.parseInt(split_in[2]));

		}

		sc.close();
		
		for (int i = 0; i < cases; i++) {
			System.out.println(canfill(n.get(i), k.get(i), m.get(i)));
		}
	}
	public static int canfill(int n,int k,int m) {
		if(n%(k*m)==0) {
			return n/(k*m);
		}
		else if(n%(k*m)>0) {
			return (n/(k*m))+1;
		}
		return 0;
	}

}
