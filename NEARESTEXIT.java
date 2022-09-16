package codechef;

import java.util.*;

public class NEARESTEXIT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		List<Integer> x = new ArrayList<>();
		for (int i = 0; i < cases; i++) {
			x.add(sc.nextInt());
		}
		sc.close();
		for (int e : x) {
			if (e <= 50) {
				System.out.println("LEFT");
			} else if (e > 50) {
				System.out.println("RIGHT");
			}
		}
	}

}
