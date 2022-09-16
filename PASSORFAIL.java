package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class PASSORFAIL {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> p = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String inputs = sc.nextLine();
			String[] split_in = inputs.split(" ");
			n.add(Integer.parseInt(split_in[0]));
			x.add(Integer.parseInt(split_in[1]));
			p.add(Integer.parseInt(split_in[2]));

		}

		sc.close();
		
		for (int i = 0; i < cases; i++) {
			System.out.println(getResult(n.get(i), x.get(i), p.get(i)));
		}

	}
	
	public static String getResult(int n,int x,int p) {
		int incorrect=-1*(n-x);
		int totalscore=x*3;
		int final_score=totalscore+incorrect;
		if(final_score<p) {
			return "Fail";
		}
		else if(final_score>=p) {
			return "Pass";
		}
		return " ";
	}

}
