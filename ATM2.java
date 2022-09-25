package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ATM Machine
public class ATM2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> a=new ArrayList<>();
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int n=sc.nextInt();//n people
			int k=sc.nextInt();//k units of money
			for(int j=0;j<n;j++) {
				a.add(sc.nextInt());
			}
			System.out.println(canWithdraw(a, n, k));
			a.clear();
		}
		sc.close();
	}
	public static String canWithdraw(List<Integer> a,int n,int k) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			if(a.get(i)<=k) {
				sb.append("1");
				k-=a.get(i);
			}
			else {
				sb.append("0");
			}
		}
		return sb.toString();
	}

}
/*
 * 
 2
5 10
3 5 3 2 1
4 6
10 8 6 4
 */
