package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NOTEBOOK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		List<Integer> x=new ArrayList<>();
		for(int i=0;i<cases;i++) {
			x.add(sc.nextInt());
		}
		sc.close();
		for(int e:x) {
			System.out.println(getNotebooks(e));
		}
		
	}
	public static int getNotebooks(int x) {
		return x*1000/100;
	}

}
