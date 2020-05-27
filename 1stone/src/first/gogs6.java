package first;

import java.util.Scanner;

public class gogs6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T > 0) {
		String yes = sc.next();
		String[] strArray = yes.split("\\.");
		String result;
		for (int i = 0; i < strArray.length; i++) {
		result = "";
		for (int j = strArray[i].length() - 1; j >= 0; j--) {
		result = result + strArray[i].charAt(j);
		}
		System.out.print(result);
		if(i != strArray.length - 1) {
		System.out.print(".");
		}
		}
		System.out.println();
		T--;
		}

	}

}
