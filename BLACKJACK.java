package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class BLACKJACK {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			a.add(Integer.parseInt(split_in[0]));
			b.add(Integer.parseInt(split_in[1]));
		}

		sc.close();

		for (int i = 0; i < cases; i++) {
			System.out.println(getRequiredNo(a.get(i), b.get(i)));
		}

	}
	public static int getRequiredNo(int a,int b) {
		int remain=21-(a+b);
		if(remain<=10) {
			return remain;
		}
		else
			return -1;
	}

}
