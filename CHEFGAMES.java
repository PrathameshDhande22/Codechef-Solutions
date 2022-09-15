package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CHEFGAMES {

	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<>();
		ArrayList<Integer> r2 = new ArrayList<>();
		ArrayList<Integer> r3 = new ArrayList<>();
		ArrayList<Integer> r4 = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			
			String[] split_in = sc.nextLine().split(" ");
			r1.add(Integer.parseInt(split_in[0]));
			r2.add(Integer.parseInt(split_in[1]));
			r3.add(Integer.parseInt(split_in[2]));
			r4.add(Integer.parseInt(split_in[3]));

		}

		sc.close();
		for(int i=0;i<cases;i++) {
			System.out.println(getRefereeDecision(r1.get(i), r2.get(i), r3.get(i), r4.get(i)));
		}

	}
	
	public static String getRefereeDecision(int r1,int r2,int r3,int r4) {
		int count1=0,count0=0;
		ArrayList<Integer> all_dec=new ArrayList<>();
		all_dec.add(r1);
		all_dec.add(r2);
		all_dec.add(r3);
		all_dec.add(r4);
		
		for(int ele:all_dec) {
			if(ele==1) {
				count1++;
			}
			else if(ele==0) {
				count0++;
			}
		}
		if(count1==4) {
			return "OUT";
		}
		else if(count0==4) {
			return "IN";
		}
		else {
			return "OUT";
		}
	}

}
