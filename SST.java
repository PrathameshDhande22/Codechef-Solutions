package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class SST {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] split_in = sc.nextLine().split(" ");
			a.add(Integer.parseInt(split_in[0]));
			b.add(Integer.parseInt(split_in[1]));

		}

		sc.close();
		for (int i = 0; i < cases; i++) {
			System.out.println(getBestEvaluator(a.get(i), b.get(i)));
		}

	}
	public static String getBestEvaluator(int a,int b) {
		int evala,evalb;
		evala=(a/10)*100;
		evalb=(b/20)*100;
		if(evala<evalb) {
			return "SECOND";
		}
		else if(evala>evalb) {
			return "FIRST";
		}
		else if(evala==evalb) {
			return "ANY";
		}
		return " ";
	}

}
