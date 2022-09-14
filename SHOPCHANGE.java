package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SHOPCHANGE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		List<Integer> x=new ArrayList<>();
		for(int i=0;i<cases;i++) {
			x.add(sc.nextInt());
		}
		int rem;
		for(int element:x) {
			rem=100-element;
			System.out.println(rem);
		}
		sc.close();
	}
	

}
