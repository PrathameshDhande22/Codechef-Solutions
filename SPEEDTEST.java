package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class SPEEDTEST {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			
			String[] split_in = sc.nextLine().split(" ");
			a.add(Integer.parseInt(split_in[0]));
			x.add(Integer.parseInt(split_in[1]));
			b.add(Integer.parseInt(split_in[2]));
			y.add(Integer.parseInt(split_in[3]));

		}

		sc.close();
		for(int i=0;i<cases;i++) {
			int alice=a.get(i)*y.get(i);
			int bob=b.get(i)*x.get(i);
			if(alice>bob) {
				System.out.println("Alice");
				
			}
			else if(alice<bob) {
				System.out.println("Bob");
			}
			else
				System.out.println("Equal");
		}

	}

}
