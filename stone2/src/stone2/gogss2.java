package stone2;

import java.util.Scanner;

public class gogss2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		String a=sc.next();
		String b=sc.next();

		boolean isAnagram=true;
		int a1[]=new int[256];
		for(char c: a.toCharArray()){
		int index=(int) c;
		a1[index]++;
		}
		for(char c: b.toCharArray()){
		int index=(int) c;
		a1[index]--;
		}
		for(int i=0;i<256;i++){
		if(a1[i] !=0){
		isAnagram=false;
		break;
		}
		}
		if(isAnagram){
		System.out.println("YES");
		}
		else{
		System.out.println("NO");
		}


			}

	}

}
