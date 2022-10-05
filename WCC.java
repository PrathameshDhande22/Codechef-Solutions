package codechef;

import java.util.Scanner;

public class WCC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int x = sc.nextInt();
			String wins = sc.next();
			System.out.println(getmoney(x, wins));
		}
		sc.close();
	}

	public static int getmoney(int x, String wins) {
		int c_draw = 0, c_chef = 0, c_carslen = 0;
		for (int i = 0; i < wins.length(); i++) {
			char winner = wins.charAt(i);
			if (winner == 'C') {
				c_carslen++;
			} else if (winner == 'D') {
				c_draw++;
			} else if (winner == 'N') {
				c_chef++;
			}

		}
		int point_carslen = (c_carslen * 2) + c_draw;
		int point_chef = (c_chef * 2) + c_draw;
		if (point_carslen == point_chef) {
			return 55 * x;
		} else {
			return (point_carslen > point_chef ? 60 * x : 40 * x);
		}

	}

}
/*
 * 4 100 CCCCCCCCCCCCCC 400 CDCDCDCDCDCDCD 30 DDCCNNDDDCCNND 1 NNDNNDDDNNDNDN
 * 
 * op: 6000 24000 1650 40
 * 
 */