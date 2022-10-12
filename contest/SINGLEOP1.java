package codechef.contest;

import java.util.Scanner;

public class SINGLEOP1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int len = sc.nextInt();
			String binary = sc.next();
			int count = 0;
			for (int a = 0; a < binary.length(); a++) {
				char bin = binary.charAt(a);
				if (bin == '1') {
					count++;
				} else {
					break;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
