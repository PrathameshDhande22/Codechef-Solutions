package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class FLOORS {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			x.add(Integer.parseInt(split_in[0]));
			y.add(Integer.parseInt(split_in[1]));
		}

		sc.close();

		for (int i = 0; i < cases; i++) {
			System.out.println(getFloors(x.get(i), y.get(i)));
		}

	}
	public static int getFloors(int x,int y) {
		return Math.abs(((x-1)/10)-((y-1)/10));
	}

}
