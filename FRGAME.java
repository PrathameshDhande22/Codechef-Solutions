package codechef;

import java.util.Scanner;

public class FRGAME {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			int a=sc.nextInt(); //nitin
			int b=sc.nextInt();//sobhagya
			int c=sc.nextInt(); //ritik
			int d=sc.nextInt(); //satyarth
			System.out.println(predictWinner(a, b, c, d));
		}
		sc.close();
	}
	
	public static String predictWinner(int a,int b,int c,int d) {
		
		if(a>=b){
			//declaring that nitin is winner
			b+=c;
		}
		else if(a<b){
			a+=c;
		}
		
		if(a>=b) {
			b+=d;
		}
		else if(a<b) {
			a+=d;
		}
		
		if(a<b) {
			return "S";
		}
		else if(a>=b) {
			return "N";
		}
		return null;
		
	}

}
