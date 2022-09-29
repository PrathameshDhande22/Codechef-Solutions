package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPCCERT {
	public static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //no of student
		int m=sc.nextInt(); //no of minutes lecture
		int k=sc.nextInt();// no of lecturess watched
		for(int i=0;i<n;i++) {
			List<Integer> lec=new ArrayList<>();
			for(int j=0;j<=k;j++) {
				lec.add(sc.nextInt());
			}
			if (canGetCertificate(lec, m)) {
				count++;
			}
			lec.clear();
		}
		sc.close();
		System.out.println(count);
	}
	
	public static boolean canGetCertificate(List<Integer> lec,int m) {
		int que=lec.get(lec.size()-1);
		lec.remove(lec.size()-1);
		int completed_min=0;
		for(int i:lec) {
			completed_min+=i;
		}
		if(completed_min>=m && que<=10) {
			return true;
		}
		else {
			return false;
		}
	}

}
/*
4 8 4
1 2 1 2 5
3 5 1 3 4
1 2 4 5 11
1 1 1 3 12

*/