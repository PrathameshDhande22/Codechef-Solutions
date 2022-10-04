package codechef;

import java.util.Scanner;

public class SHOEFIT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a%2==0 && b%2==0 && c%2==0)
		    {
		        System.out.println(0);
		    }
		    else if(a%2!=0 && b%2!=0 &&c%2!=0)
		    {
		        System.out.println(0);
		    }else{
		        System.out.println(1);
		    }
			
		}
		sc.close();
	}

}
