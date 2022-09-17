package codechef;

import java.util.Scanner;

public class T20MCH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		System.out.println(canWin(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
		sc.close();

	}

	public static String canWin(int r, int o, int c) {
		int score = c + (((20 - o) * 6) * 6);
		if (score <= r) {
			return "No";
		} else if (score > r) {
			return "Yes";
		}
		return " ";
	}

}
