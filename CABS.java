package codechef;
import java.util.Scanner;

public class CABS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_case =sc.nextInt();
		int[] x=new int[no_of_case];
		int[] y=new int[no_of_case];
//		String price;
		sc.nextLine();
		for(int i=0;i<no_of_case;i++) {
//			System.out.println(i);
			String price=sc.nextLine();
			String[] price_sep=price.split(" ");
			
//			System.out.println(price_sep[0]+" "+price_sep[1]);
			x[i]=Integer.parseInt(price_sep[0]);
			y[i]=Integer.parseInt(price_sep[1]);
			
		}
		
		for(int i=0;i<no_of_case;i++) {
			if(x[i]<y[i]) {
				System.out.println("FIRST");
			}
			else if(x[i]==y[i]){
				System.out.println("ANY");
			}
			else {
				System.out.println("SECOND");
			}
		}
		sc.close();
		

	}

}

/*
 * 3
30 65
42 42
90 50

*/
