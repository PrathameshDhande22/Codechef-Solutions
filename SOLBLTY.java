package codechef;

import java.util.Scanner;

public class SOLBLTY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int x=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(getSugar(x, a, b));
		}
		sc.close();
	}
	public static int getSugar(int x,int a,int b) {
		return (a+(100-x)*b)*10;
	}

}
/*
3
40 120 1
35 120 2
40 115 3



*/