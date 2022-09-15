package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class COURSEREG {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<Integer> m = new ArrayList<>();
		ArrayList<Integer> k = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] split_in = sc.nextLine().split(" ");
			n.add(Integer.parseInt(split_in[0]));
			m.add(Integer.parseInt(split_in[1]));
			k.add(Integer.parseInt(split_in[2]));

		}

		sc.close();
		for (int i = 0; i < cases; i++) {
			System.out.println(canAccomodate(n.get(i), m.get(i), k.get(i)));
		}

	}

	public static String canAccomodate(int n, int m, int k) {
		String to_be_returned = " ";
		if ((n + k) <= m) {
			to_be_returned = "yes";
		} else {
			to_be_returned = "no";
		}
		return to_be_returned;
	}

}
