package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class TYRE {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> m = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {

			String[] split_in = sc.nextLine().split(" ");
			x.add(Integer.parseInt(split_in[0]));
			m.add(Integer.parseInt(split_in[1]));

		}
		sc.close();
		for(int i=0;i<cases;i++) {
			System.out.println(getTotalTyre(x.get(i), m.get(i)));
		}
	}
	
	public static int getTotalTyre(int x,int m) {
		return x*2+m*4;
	}

}
