package codechef;

import java.util.*;

public class WORDLE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> ans_list=new ArrayList<>();
		int cases=sc.nextInt();
		String s;  //hidden word
		String t;  //guess word
		sc.nextLine();
		for(int i=0;i<cases;i++) {
			s=sc.nextLine();
			t=sc.nextLine();
			ans_list.add(getString(s, t));
		}
		sc.close();
		for(String ans:ans_list) {
			System.out.println(ans);
		}
	}
	public static String getString(String hiddenword,String guessword) {
		String [] s=hiddenword.split("");
		String[] t=guessword.split("");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<5;i++) {
			if(s[i].equals(t[i])) {
				sb.append("G");
			}
			else {
				sb.append("B");
			}
		}
		return sb.toString();
	}

}
