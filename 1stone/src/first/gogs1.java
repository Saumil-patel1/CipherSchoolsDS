package first;

import java.util.Scanner;

public class gogs1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    for(int z = 0 ; z < testCases;z++)
	    {
	        int size = sc.nextInt();
	        int sum = 0;
	        for(int i=0;i<size-1;i++)
	        {
	            sum+=sc.nextInt();
	        }
	        System.out.println((size*(size+1))/2-sum);
	    }
	

	}

}
