package first;

import java.util.Scanner;

public class gogs3 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int k = scan.nextInt();
		    while(k-- > 0){
		        String s = scan.next();
		        StringBuffer t = new StringBuffer("");
		        for(int i=0;i<s.length();i++){
		            if(s.charAt(i) == '6'){
		                t = t.append("9");   
		            }
		            else{
		                char ch = s.charAt(i);
		                t = t.append(ch);
		            }
		        }
		        int x = Integer.parseInt(s);
		        String l = String.valueOf(t);
		        int y = Integer.parseInt(l);
		        System.out.println(y-x);
		    }

	}

}
