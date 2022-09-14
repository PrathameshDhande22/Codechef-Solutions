package codechef;

import java.util.Scanner;

public class PRACLIST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String input=sc.nextLine();
		String[] in=sc.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(in[0])-Integer.parseInt(in[1]));
		sc.close();
	}

}
