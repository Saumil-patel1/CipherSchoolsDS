package first;

import java.util.Scanner;

public class gogs2 {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
String name=sc.next();
for(int i=name.length()-1;i>=0;i--){
System.out.print(name.charAt(i));
}
System.out.println();
t--;
}}

	}


