package codechef.contest;

import java.util.Scanner;

public class SPECIALITY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int x = sc.nextInt(); // setter
			int y = sc.nextInt(); // tester
			int z = sc.nextInt(); // edutorialist
			System.out.println(active(x, y, z));
		}
		sc.close();
	}

	public static String active(int x, int y, int z) {
		if (x > y && x > z) {
			return "Setter";
		} else if (y > x && y > z) {
			return "Tester";
		} else if (z > x && z > y) {
			return "Editorialist";
		}
		return "";
	}

}
