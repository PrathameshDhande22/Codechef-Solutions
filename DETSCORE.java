package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class DETSCORE {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> n = new ArrayList<>();
		

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			x.add(Integer.parseInt(split_in[0]));
			n.add(Integer.parseInt(split_in[1]));
			

		}

		sc.close();
		
		// TODO Auto-generated method stub
		for (int i = 0; i < cases; i++) {
			System.out.println(getScore(x.get(i), n.get(i)));
		}

	}
	public static int getScore(int x,int n) {
		return (x/10)*n;
	}

}
