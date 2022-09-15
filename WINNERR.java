package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class WINNERR {

	public static void main(String[] args) {
		ArrayList<Integer> pa = new ArrayList<>();
		ArrayList<Integer> pb = new ArrayList<>();
		ArrayList<Integer> qa = new ArrayList<>();
		ArrayList<Integer> qb = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			
			String[] split_in = sc.nextLine().split(" ");
			pa.add(Integer.parseInt(split_in[0]));
			pb.add(Integer.parseInt(split_in[1]));
			qa.add(Integer.parseInt(split_in[2]));
			qb.add(Integer.parseInt(split_in[3]));

		}

		sc.close();
		for(int i=0;i<cases;i++) {
			System.out.println(getBestRank(pa.get(i), pb.get(i), qa.get(i), qb.get(i)));
		}
	}
	
	public static String getBestRank(int pa,int pb,int qa,int qb) {
		int x=Math.max(pa, pb);
		int y=Math.max(qa, qb);
		if(x<y) {
			return "P";
		}
		else if(x>y) {
			return "Q";
		}
		else {
			return "Tie";
		}
		
	}

}
