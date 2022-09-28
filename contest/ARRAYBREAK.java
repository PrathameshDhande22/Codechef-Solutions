package codechef.contest;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYBREAK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			ArrayList<Integer> a=new ArrayList<>();
			int n=sc.nextInt();
			int odd=0;
			for(int j=0;j<n;j++) {
				a.add(sc.nextInt());
				if(a.get(j)%2!=0) {
					odd++;
				}
			}
			if(odd==n || odd==0) {
				System.out.println(0);
			}
			else {
				System.out.println(n-odd);
			}
			
			a.clear();
			
		}
		sc.close();
	}

}
/**
 * 
 * 2
4
1 3 5 7
3
1 2 3
*/
