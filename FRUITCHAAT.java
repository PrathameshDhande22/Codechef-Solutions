package codechef;
import java.util.Scanner;

public class FRUITCHAAT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(getChaats(x, y));
        }
        sc.close();
    }
    public static int getChaats(int x,int y){
        int tot=x/2;
        if(tot<=y){
            return tot;
        }
        else 
            return y;
    }
}
