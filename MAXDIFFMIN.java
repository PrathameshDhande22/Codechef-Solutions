package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MAXDIFFMIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			ArrayList<Integer> storenum = new ArrayList<>();
			int a = sc.nextInt();
			storenum.add(a);
			int b = sc.nextInt();
			storenum.add(b);
			int c = sc.nextInt();
			storenum.add(c);
			System.out.println(Collections.max(storenum) - Collections.min(storenum));
		}
		sc.close();
	}

}
