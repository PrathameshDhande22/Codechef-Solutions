package codechef;

import java.util.*;

public class PRESENTS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ans=new ArrayList<>();
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int x=sc.nextInt();
			ans.add(getCoins(x));
			
		}
		sc.close();
		for(int e:ans) {
			System.out.println(e);
		}

	}
	public static int getCoins(int no) {
		return no-(no/5);
	}

}
