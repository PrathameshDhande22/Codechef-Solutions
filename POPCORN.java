package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class POPCORN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> showmax = new ArrayList<>();
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			for (int j = 0; j < 3; j++) {
				int value1 = sc.nextInt();
				int value2 = sc.nextInt();
				int sum = value1 + value2;
				showmax.add(sum);
			}
			System.out.println(Collections.max(showmax));
			showmax.clear();

		}
		sc.close();
	}

}
