package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class BATH {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] split_in = sc.nextLine().split(" ");
			x.add(Integer.parseInt(split_in[0]));
			y.add(Integer.parseInt(split_in[1]));

		}

		sc.close();
		for (int i = 0; i < cases; i++) {
			System.out.println(getPeopleCanBath(x.get(i), y.get(i)));
		}
	}
	
	public static int getPeopleCanBath(int x,int y) {
		return x/(y*2);
	}

}
