package codechef;

import java.util.Scanner;

//Easy Pronunciation

public class EZSPEAK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char [] vowel= {'a','e','i','o','u'};
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			if (s.length() <= 4) {
				System.out.println("Yes");
			} else {
				int temp = 0;
				for (int j = 0; j < n; j++) {
					char ex = s.charAt(j);
					if (ex != 'a' && ex != 'e' && ex != 'i' && ex != 'o' && ex != 'u') {
						temp++;
					} else {
						if (temp >= 4) {
							break;
						} else {
							temp = 0;
							continue;
						}
					}
				}
				if (temp < 4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}
		sc.close();
	}
}

/*
 * 
 * 
 * 5 5 apple 15 schtschurowskia 6 polish 5 tryst 3 cry
 * 
 */
