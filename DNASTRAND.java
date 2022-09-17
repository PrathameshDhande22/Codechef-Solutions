package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class DNASTRAND {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int length;
		String dna = "";
		ArrayList<String> ans_list = new ArrayList<>();

		for (int i = 0; i < cases; i++) {
			length = sc.nextInt();
			sc.nextLine();
			dna = sc.nextLine();
			String[] splitted = dna.split("");
			ans_list.add(getComplement(splitted, length));
//			getComplement(splitted, length);
		}
		sc.close();
		for(String s:ans_list) {
			System.out.println(s);
		}

	}

	public static String getComplement(String[] dna, int length) {
		ArrayList<String> as = new ArrayList<>();
		for (String a : dna) {
			if (a.equals("A")) {
				as.add("T");
			} else if (a.equals("T")) {
				as.add("A");
			} else if (a.equals("C")) {
				as.add("G");
			} else if (a.equals("G")) {
				as.add("C");
			}
		}
		StringBuffer sb=new StringBuffer();
		for(String d:as) {
			sb.append(d);
		}
		return sb.toString();

	}

}
