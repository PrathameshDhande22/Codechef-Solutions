package codechef;

import java.util.Scanner;

public class GROUPASSGN {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            System.out.println(((2*n)+1)-x);
        }
        sc.close();
    }
    
    
}
