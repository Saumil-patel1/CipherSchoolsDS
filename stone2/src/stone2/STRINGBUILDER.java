package stone2;

public class STRINGBUILDER {

	public static void main(String[] args) {
	StringBuilder p=new StringBuilder("saumil");
	p.insert(1,"java");
	System.out.println(p);
	StringBuilder sb=new StringBuilder("yyoyoy");  
	sb.replace(1,3,"Java");  
	System.out.println(sb);
	StringBuilder b=new StringBuilder("saumil");  
	b.delete(1,3);  
	System.out.println(b);
	StringBuilder c=new StringBuilder("sayml");  
	c.reverse();  
	System.out.println(c);
	StringBuilder r=new StringBuilder();  
	System.out.println(r.capacity());
	r.append("Hello");  
	System.out.println(r.capacity());
	r.append("java is my favourite language");  
	System.out.println(r.capacity());
	r.ensureCapacity(50);
	System.out.println(r.capacity());
			

	}

}
