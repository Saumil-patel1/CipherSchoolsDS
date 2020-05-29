package stone2;
class Node{
	int data;
	Node next;//reference variable
	Node(int data){
		this.data=data;
		this.next=null;
				
	}
}

public class linkedlist {
	

	public static void main(String[] args) {
Node head=new Node(1);		
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
head.next.next.next.next=new Node(5);
head.next.next.next.next.next=new Node(6);
//while(head!=null) {
//	System.out.println(head.data+" ");
//	head=head.next;
//}
Node temp=head;
while(temp!=null) {
	System.out.print(temp.data+" ");
	temp=temp.next;
}System.out.println();
 temp=head;
 int count=0;
while(temp!=null) {
	count++;
	temp=temp.next;
	
}
System.out.println("no of nodes"+count);

	}

}
