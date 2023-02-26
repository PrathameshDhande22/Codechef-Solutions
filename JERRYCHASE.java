package codechef;

import java.util.Scanner;

public class JERRYCHASE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int jerry = sc.nextInt();
			int tom = sc.nextInt();
			if (tom > jerry) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}
