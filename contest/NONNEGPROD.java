package codechef.contest;

import java.util.Scanner;

public class NONNEGPROD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int no = sc.nextInt();
			int[] ar = new int[no];
			for (int j = 0; j < no; j++) {
				ar[j] = sc.nextInt();
			}
			System.out.println(geteleRemove(ar, no));

		}
		sc.close();

	}

	public static int geteleRemove(int[] ar, int no) {
		int mul = 1, count = 0;
		for (int i = 0; i < ar.length; i++) {
			mul = mul * ar[i];
			if (ar[i] < 0) {
				count++;
			}
		}
		if(mul>=0) {
			return 1;
		}
		else {
			if(count%2==0) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}

}
/*
 * 4 3 1 9 8 4 2 -1 9 100 4 2 -1 0 100 4 2 -1 -1 100
 */
