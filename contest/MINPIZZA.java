package codechef.contest;

import java.util.Scanner;

public class MINPIZZA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int slices_req = n * x;
			if (slices_req % 4 == 0) {
				System.out.println(slices_req / 4);
			} else {
				System.out.println((slices_req / 4) + 1);
			}
		}
		sc.close();
	}

}
