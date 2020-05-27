package first;

import java.util.Scanner;

public class gogs4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while((t--)>0)
		{
		String a = sc.nextLine();
		String b = sc.nextLine();

		String c=b+b;


		int ind = c.indexOf(a);

		if(ind==2 || ind==b.length()-2)
		{
		System.out.println("1");
		}
		else
		{
		System.out.println("0");
		}
		}

	}

}
