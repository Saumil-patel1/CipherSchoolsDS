package first;

import java.util.Scanner;

public class gogs5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		--t;
		String s=sc.next();
		String temp="";
		int l=s.length();
		String[] arr=s.split("\\.");
		for(int i=arr.length-1;i>=0;i--){
		temp=temp+arr[i];
		if(i>0){
		temp=temp+".";}
		}
		System.out.println(temp);
			}

	}

}
