package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CWIREFRAME {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<Integer> m = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			n.add(Integer.parseInt(split_in[0]));
			m.add(Integer.parseInt(split_in[1]));
			x.add(Integer.parseInt(split_in[2]));

		}

		sc.close();
		
		for (int i = 0; i < cases; i++) {
			System.out.println(overall_cost(n.get(i), m.get(i), x.get(i)));
		}

	}

	public static int overall_cost(int n, int m, int x) {
		int cost;
		cost = x * (2 * n + 2 * m);
		return cost;
	}
}
/*
 * 
 * 3 10 10 10 23 3 12 1000 1000 1000
 */
