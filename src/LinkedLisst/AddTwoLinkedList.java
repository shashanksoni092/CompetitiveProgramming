package LinkedLisst;


class Node{
	
	int data;
	Node next;
	Node prev;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	
}
public class AddTwoLinkedList {

	
	public static void main(String[] args) {
		
	System.out.println("Node 1:");	
	
	//Instantiate
	Node a=new Node(9);
	Node b=new Node(9);
	Node c=new Node(9);
	Node d=new Node(9);
	Node e=new Node(9);
	Node head=new Node(0);
	
	//next
	a.next=b;
	b.next=c;
	c.next=d;
	d.next=e;
	e.next=null;
	head.next=a;
	
	//prev
	e.prev=d;
	d.prev=c;
	c.prev=b;
	b.prev=a;
	a.prev=head;
	
	
	Node temp=head;
	
	
	while(temp.next!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println(temp.data);
	
	//Instantiate
	System.out.println("Node 2:");
	Node a2=new Node(9);
	Node b2=new Node(9);
	Node c2=new Node(9);
	Node d2=new Node(9);
	Node e2=new Node(9);
	Node head2=new Node(0);
	
	//next
	a2.next=b2;
	b2.next=c2;
	c2.next=d2;
	d2.next=e2;
	e2.next=null;
	
	//prev
	e2.prev=d2;
	d2.prev=c2;
	c2.prev=b2;
	b2.prev=a2;
	a2.prev=head2;
		
	head2.next=a2;
	Node temp2=head2;
	
	while(temp2.next!=null)
	{
		System.out.print(temp2.data+" ");
		temp2=temp2.next;
	}
	System.out.println(temp2.data);
	
	//Heading towards the last position for LinkedList1
	temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;
				
	}
	
	//Heading towards the last position for LinkedList2
	temp2=head2;
	while(temp2.next!=null)
	{
		temp2=temp2.next;
				
	}
	
	
	Node ar= new Node(0);
	Node br= new Node(0);
	Node cr= new Node(0);
	Node dr= new Node(0);
	Node er= new Node(0);
	Node headr=new Node(0);
	
	//next
	ar.next=br;
	br.next=cr;
	cr.next=dr;
	dr.next=er;
	er.next=null;
	headr.next=ar;	
	//Heading towards the last position for LinkedList_res
	Node tempr=headr;
	while(tempr.next!=null)
	{
		tempr=tempr.next;
					
	}
		
	//prev
	er.prev=dr;
	dr.prev=cr;
	cr.prev=br;
	br.prev=ar;
	ar.prev=head;
	
	int carry=0;
	
	while(temp!=head && temp2!=head2 && tempr!=headr)
	{
		
		//System.out.println("Bye");
		//System.out.println(temp.data +" "+temp2.data);
		int res=temp.data+temp2.data+carry;
		//System.out.println("Hhello");
		//System.out.println(res);
		if(res>9)
		{
			tempr.data=res%10;
			carry=res/10;
		}
		else {
			tempr.data=res;
			carry=0;
		}
		
		temp=temp.prev;
		temp2=temp2.prev;
		tempr=tempr.prev;
		
		
	}
	headr.data=temp.data+temp2.data+carry;
	
	System.out.println("Result is:-");
	Node res=headr;
	while(res.next!=null)
	{
		System.out.print(res.data+" ");
		res=res.next;
	}
	System.out.println(res.data);
	
	}

}
