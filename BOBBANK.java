package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class BOBBANK {

	public static void main(String[] args) {
		ArrayList<Integer> w = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Integer> z = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			w.add(Integer.parseInt(split_in[0]));
			x.add(Integer.parseInt(split_in[1]));
			y.add(Integer.parseInt(split_in[2]));
			z.add(Integer.parseInt(split_in[3]));
		}

		sc.close();
		for (int i = 0; i < cases; i++) {
			System.out.println(final_ac(w.get(i), x.get(i), y.get(i), z.get(i)));
		}

	}

	public static int final_ac(int w, int x, int y, int z) {
		int no;
		no = w + (x - y) * z;
		return no;
	}

}
/*
 * 3 100 11 1 10 999 25 36 9 2500 100 125 101
 */
