package codechef.contest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class REMOVECARDS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			System.out.println(n-occurences(a));
		}
		sc.close();

	}

	public static int occurences(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int occur = 0;
		for (int ele : a) {
			if (hm.containsKey(ele)) {
				occur = hm.get(ele);
				occur++;
				hm.put(ele, occur);
				occur = 0;
			} else {
				occur++;
				hm.put(ele, occur);
				occur = 0;
			}
		}

		return Collections.max(hm.values());

	}

}
