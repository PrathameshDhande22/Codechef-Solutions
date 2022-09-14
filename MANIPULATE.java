package codechef;

import java.util.Scanner;

public class MANIPULATE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		int[] x=new int[cases];  //Ezio guards
		int[] y=new int[cases];   // total no of guards
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String input=sc.nextLine();
			String[] split_nos=input.split(" ");
			x[i]=Integer.parseInt(split_nos[0]);
			y[i]=Integer.parseInt(split_nos[1]);
		}
		sc.close();
		
		for(int i=0;i<cases;i++) {
			System.out.println(canManipulate(x[i], y[i]));
		}

	}
	
	public static String canManipulate(int x,int y) {
		if(x<y) {
			return "NO";
		}
		else if(x==y) {
			return "YES";
		}
		else {
			return "YES";
		}
	}

}

/*
 * 3
5 7
6 6
9 1
 */
