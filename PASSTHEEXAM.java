package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class PASSTHEEXAM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		ArrayList<Integer> c=new ArrayList<>();
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String[] inputs=sc.nextLine().split(" ");
			a.add(Integer.parseInt(inputs[0]));
			b.add(Integer.parseInt(inputs[1]));
			c.add(Integer.parseInt(inputs[2]));
		}
		sc.close();
		for(int i=0;i<cases;i++) {
			System.out.println(getExamStatus(a.get(i), b.get(i), c.get(i)));
		}

	}
	
	public static String getExamStatus(int a,int b,int c) {
		if((a<10)||(b<10)||(c<10)) {
			return "FAIL";
		}
		else {
			if(a+b+c>=100) {
				return "PASS";
			}
			else {
				return "FAIL";
			}
		}
	}

}
