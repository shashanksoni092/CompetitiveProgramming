package LinkedLisst;

class Node1{
	char data;
	Node1 next;
	
	public Node1(char data)
	{
		this.data=data;
		this.next=null;
	}
	
}
public class DetectingLoopTwoPointers {

	public static void main(String[] args) {

		System.out.println("Node 1:");	
		
		//Instantiate
		Node1 a=new Node1('a');
		Node1 b=new Node1('b');
		Node1 c=new Node1('c');
		Node1 d=new Node1('d');
		Node1 e=new Node1('e');
		Node1 head=new Node1('h');
		
		//next
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		head.next=a;
		e.next=c;	
		
		Node1 fastPtr=head;
		Node1 slowPtr=head;
		
		while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			
			if(slowPtr==fastPtr)
			{
				System.out.println(slowPtr.data);
				System.out.println("Loop Detected");
				return;
			}
			
		}
		System.out.println("Loop not Detected");
		
		
	}

}
