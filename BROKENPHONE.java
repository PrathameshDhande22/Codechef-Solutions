package codechef;
import java.util.Scanner;

public class BROKENPHONE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		int[] x=new int[cases];  //repaired by spending money
		int[] y=new int[cases];   // new phone by spending money
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String input=sc.nextLine();
			String[] split_nos=input.split(" ");
			x[i]=Integer.parseInt(split_nos[0]);
			y[i]=Integer.parseInt(split_nos[1]);
		}
		sc.close();
		
		for(int i=0;i<cases;i++) {
			System.out.println(getPhone(x[i], y[i]));
		}
	}
	
	public static String getPhone(int x,int y) {
		if(x<y) {
			return "REPAIR";
		}
		else if(x==y) {
			return "ANY";
		}
		else 
			return "NEW PHONE";
	}

}

/*
 * 3
100 1000
10000 5000
3000 3000
 * 
 * 
 * 
 */
