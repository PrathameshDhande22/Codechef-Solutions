package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class DNASTORAGE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ans=new ArrayList<>();
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			int length=sc.nextInt();
			sc.nextLine();
			String bin=sc.nextLine();
			ans.add(getDna(bin,length));
		}
		sc.close();
		for(String ele:ans) {
			System.out.println(ele);
		}
	}
	public static String getDna(String bin,int length) {
		int i=length/2;
		int count=0,count2=2;
		StringBuffer sb=new StringBuffer();
		while(count<i) {
			String eval=bin.substring(count*2,count2);
			count++;
			count2=count2+2;
			sb.append(compareDna(eval));
		}
		return sb.toString();
	}
	public static String compareDna(String eval) {
		if(eval.equals("00")) {
			return "A";
		}
		else if(eval.equals("01")) {
			return "T";
		}
		else if(eval.equals("10")) {
			return "C";
		}
		else if(eval.equals("11")) {
			return "G";
		}
		return " ";
	}

}
