package codechef;

import java.util.*;

public class C_RATING {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] inputs = sc.nextLine().split(" ");
			ans.add(getRequiredGame(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1])));
		}
		sc.close();
		for(int ele:ans) {
			System.out.println(ele);
		}

	}

	public static int getRequiredGame(int x, int y) {
		int count=0;
		while(x<y) {
			x+=8;
			count++;
		}
		return count;
	}

}
