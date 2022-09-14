package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MINCARS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		List<Integer> x=new ArrayList<>();
		for(int i=0;i<cases;i++) {
			x.add(sc.nextInt());
		}
		sc.close();
		
		for(int e:x) {
			System.out.println(getCars(e));
		}
		

	}
	
	public static int getCars(int x) {
		
		return (int) Math.ceil((x/4)+1);
	}

}
