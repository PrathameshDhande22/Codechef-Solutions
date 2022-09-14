package codechef;
import java.util.Scanner;

public class BATTERYLOW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		int[] battery_lvl=new int[cases];
		for(int i=0;i<cases;i++) {
			battery_lvl[i]=sc.nextInt();
		}
		
		for(int i=0;i<cases;i++) {
			if(battery_lvl[i]<=15) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		sc.close();

	}

}

/*
 * 3
15
3
65
 */
