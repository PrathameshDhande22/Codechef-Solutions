package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class FIT {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			x.add(sc.nextInt());
		}
		for(int i=0;i<cases;i++) {
			System.out.println((x.get(i)*2)*5);
		}
		sc.close();

	}

}
