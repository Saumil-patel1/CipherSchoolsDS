package stone2;

public class printlinkedlist {
	public  void display(LIstNode head) {
		if(head==null) {
			return;
		}
		LIstNode current=head;
		while(current!=null) {
			System.out.print(current.data+"===> ");
			current= current.next;
		}
		System.out.println(current);
	}
private static	class LIstNode{
		private int data;
		 private LIstNode next;//reference variable
	public	LIstNode(int data){
			this.data=data;
			this.next=null;
					
		}
	}

	public static void main(String[] args) {
		LIstNode head=new LIstNode(1);		
		head.next=new LIstNode(2);
		head.next.next=new LIstNode(3);
		head.next.next.next=new LIstNode(4);
		head.next.next.next.next=new LIstNode(5);
		head.next.next.next.next.next=new LIstNode(6);
		printlinkedlist  print= new printlinkedlist();
		print.display(head);
	}

}
