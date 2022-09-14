package codechef;
import java.util.Scanner;

public class VOLCONTROL {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		int[] x=new int[cases];
		int[] y=new int[cases];
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			String vol=sc.nextLine();
			String[] volumes=vol.split(" ");
			x[i]=Integer.parseInt(volumes[0]);
			y[i]=Integer.parseInt(volumes[1]);
		}
		sc.close();
		
		for(int i=0;i<cases;i++) {
			if(x[i]<y[i]) {
				System.out.println(y[i]-x[i]);
			}
			else {
				System.out.println(x[i]-y[i]);
			}
		}
	}

}


/*
2
50 54
12 10
*/