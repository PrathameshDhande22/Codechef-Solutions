package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JASSIGNMENTS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		List<Integer> x=new ArrayList<>();
		for(int i=0;i<cases;i++) {
			x.add(sc.nextInt());
		}
		sc.close();
		for(int i:x) {
			if(i+3<=10) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}

	}

}
