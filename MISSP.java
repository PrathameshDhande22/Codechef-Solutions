package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class MISSP {
    public static void main(String[] args) {
        ArrayList<Integer> dols = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int a = 0; a < n; a++) {
                dols.add(sc.nextInt());
            }
            System.out.println(getpair(dols, n));
            dols.clear();
        }
        sc.close();
    }

    static int getpair(ArrayList<Integer> dols, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(dols.get(i)%2!=0){
                count++;
            }
        }
        return count;
    }
}
