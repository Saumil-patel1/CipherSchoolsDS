package stone2;

public class STRINGBUFFER {

	public static void main(String[] args) {
	StringBuffer s= new StringBuffer("Hello ");
	s.append("hello");
		System.out.println(s);
StringBuffer p=new StringBuffer("sau hello");
p.insert(3, "mil");
System.out.println(p);
StringBuffer q=new StringBuffer("sarmpl");
q.replace(2, 4, "ui");
System.out.println(q);
StringBuffer r=new StringBuffer("saiumlil");
r.delete(2, 5);
System.out.println(r);
StringBuffer t=new StringBuffer("saumil");
t.reverse();
System.out.println(t);
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("java");
System.out.println(sb.capacity());
sb.append("java is my favourite language");
	System.out.println(sb.capacity());
	sb.ensureCapacity(50);
	System.out.println(sb.capacity());
	}
	

}
