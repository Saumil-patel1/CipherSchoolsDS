package first;

public class gogs7 {

	public static void main(String[] args) {
		String str="Computer Science is my favorite branch";
		int firstIndex=str.indexOf('s');
		System.out.println("Firsrt occurence of"+"s"+firstIndex);
int lastIndex= str.lastIndexOf('c');
System.out.println("last occurence of"+"s"+lastIndex);
// Index of the first occurrence of specified char 
// after the specified index if found. 
int first_in=str.indexOf('s',5);
System.out.println("first occurence of s"+"after index 10    "+first_in);
int last_in=str.lastIndexOf('s',20);
System.out.println("last occurence of s"+"after index of 20   "+last_in);
// gives ASCII value of character at location 20 
int char_in=str.charAt(20);
System.out.println(" retun ascii  "+char_in);

	}

}
